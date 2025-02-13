package core;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.util.stream.Collector;
import java.util.List;
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
      server.start();
      System.out.println("Server is Running on port -> " + 8090);
      server.createContext("/", (exchange) -> {
         String requestBody;
         try (InputStream inputStream = exchange.getRequestBody();
               BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
            requestBody = reader.lines().collect(Collectors.joining("\n"));

            reader.close();
            inputStream.close();
         }
         switch (exchange.getRequestMethod().toString()) {
            case "GET":
               handleGet(exchange, requestBody);
               break;
            default:
               exchange.sendResponseHeaders(405, -1);
               break;
         }
      });
   }

   static void handleGet(HttpExchange exchange, String requestBody) throws IOException {
      String path = exchange.getRequestURI().getPath();
      try (OutputStream os = exchange.getResponseBody()) {
         if (path.equals("/")) {
            ObjectMapper mapper = new ObjectMapper();
            Person person = mapper.readValue(requestBody, Person.class);
            // send back the body
            exchange.sendResponseHeaders(200, requestBody.length());
            os.write(requestBody.getBytes());
            os.close();
         }
      }
   }
}
