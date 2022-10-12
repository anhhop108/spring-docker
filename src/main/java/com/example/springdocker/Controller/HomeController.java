package com.example.springdocker.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.*;

@RestController
public class HomeController {

    @GetMapping("/hello")
    public String intro(){
        return "hi success";
    }

    @GetMapping("/write")
    public String writeFile(){
        FileWriter file = null;
        try {
            file = new FileWriter("src/main/resources/static/new3.txt");
            file.write("hi my name is !");
            file.close();
            return "ok222 ";
        } catch (IOException e) {
            e.printStackTrace();
            return "k ok";
        }
    }

    @GetMapping("/read")
    public String readFile(){
        File file2 = new File("src/main/resources/static/new3.txt");
        String pathFile = file2.getAbsoluteFile().getAbsolutePath();
        System.out.println(pathFile);

        File file3 = new File(pathFile);
        BufferedReader reader = null;
        String line = null;
        StringBuilder text= new StringBuilder();
        try {
            reader = new BufferedReader(new FileReader(file3));
            line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                text.append(line);
                line = reader.readLine();
            }
            return "file ok"+pathFile+"--khong loi:"+text;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
