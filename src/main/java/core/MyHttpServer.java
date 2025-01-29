package core;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

import com.sun.net.httpserver.HttpContext;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpServer;

public class MyHttpServer {
   public static void main(String[] args) throws IOException {
      HttpServer server = HttpServer.create(new InetSocketAddress("0.0.0.0", 8080), 0);
      server.setExecutor(null);
      server.start();
      server.createContext("/", (exchange) -> {
         switch (exchange.getRequestURI().toString()) {
            case "/":
               String mss = "Hello World!";
               exchange.sendResponseHeaders(200, mss.length());
               exchange.setAttribute("test", "123");
               OutputStream os = exchange.getResponseBody();
               os.write(mss.getBytes());
               break;
            default:
               break;
         }
      });
   }
}
