package core;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.util.stream.Collectors;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpServer;

class Person {

   private String name;

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }
}

public class MyHttpServer {
   public static void main(String[] args) throws IOException {
      HttpServer server = HttpServer.create(new InetSocketAddress("0.0.0.0", 8090), 0);
      server.setExecutor(null);
      server.start();
      server.createContext("/", (exchange) -> {
         try (OutputStream os = exchange.getResponseBody()) {
            String requestBody;
            try (InputStream inputStream = exchange.getRequestBody();
                  BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
               requestBody = reader.lines()
                     .collect(Collectors.joining("\n"));
            }
            switch (exchange.getRequestMethod().toString()) {
               case "GET":
                  os.write(handleGet(exchange, requestBody));
                  break;
               default:
                  break;
            }
            os.close();
         }
      });
   }

   static byte[] handleGet(HttpExchange exchange, String requestBody) throws IOException {
      switch (exchange.getRequestURI().toString()) {
         case "/":
            ObjectMapper mapper = new ObjectMapper();
            Person person = mapper.readValue(requestBody, Person.class);
            System.out.println("Request body: " + person.getName());
            // send back the body
            exchange.sendResponseHeaders(200, requestBody.length());
            return requestBody.getBytes();
         default:
            return null;
      }
   }
}
