package grpclinter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GrpcLinter {

  public static void main(String args[]) {
    try {

      // -- Linux --

      // Run a shell command
       Process process = Runtime.getRuntime().exec("/home/edu/gitRepos/ZARA/github/tools/grpc-java-generator/src/main/protolint_0.25.1/protolint lint --config_dir_path=./proto ../proto");

      StringBuilder output = new StringBuilder();

      BufferedReader reader = new BufferedReader(
              new InputStreamReader(process.getInputStream()));

      String line;
      while ((line = reader.readLine()) != null) {
          output.append(line + "\n");
      }
      System.out.println(output);
      int exitVal = process.waitFor();
      if (exitVal == 0) {
          System.out.println("Success!");
          System.out.println(output);
          System.exit(0);
      } else {
        System.out.println("abnormal!");
      }

  } catch (IOException e) {
      e.printStackTrace();
  } catch (InterruptedException e) {
      e.printStackTrace();
  }


//    ProcessBuilder processBuilder = new ProcessBuilder();
//    processBuilder.command("bash", "-c", "/home/edu/software/protolint_0.25.1/protolint "
//        + "lint --config_dir_path=/home/edu/software/protolint_0.25.1/proto ../../proto/mecpcoco");
//
//    try {
//
//      Process process = processBuilder.start();
//
//      StringBuilder output = new StringBuilder();
//
//      BufferedReader reader = new BufferedReader(
//              new InputStreamReader(process.getInputStream()));
//
//      String line;
//      while ((line = reader.readLine()) != null) {
//          output.append(line + "\n");
//      }
//
//      int exitVal = process.waitFor();
//      if (exitVal == 0) {
//          System.out.println("Success!");
//          System.out.println(output);
//          System.exit(0);
//      } else {
//        System.out.println("failure!");
//      }
//
//  } catch (IOException e) {
//      e.printStackTrace();
//  } catch (InterruptedException e) {
//      e.printStackTrace();
//  }
  }
}
