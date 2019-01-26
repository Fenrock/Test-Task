package app;

import app.service.DatabaseService;
import app.service.ParseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Application implements CommandLineRunner
{
    @Autowired
    private DatabaseService databaseService;

    @Autowired ParseService parseService;

    public static void main(String[] args)
    {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public  void run(String[] args)
    {
        parseService.parse();
        databaseService.saveDocuments(parseService.getDownloadedJSONs());
        System.out.println("Documents saved to database");
    }

}
