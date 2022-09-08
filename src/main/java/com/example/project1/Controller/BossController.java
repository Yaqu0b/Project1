package com.example.project1.Controller;

import com.example.project1.Model.Boss;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BossController {

    @GetMapping("/boss")
    public List<Boss> getAllBoss(){
        //Return a hardcoded data from the list, a real world application will return from the dataset taht will be deployed to a server (virtual machine) or a server
        List<Boss> bossList = new ArrayList<Boss>();
        bossList.add(new Boss(1, "jim", 19));
        bossList.add(new Boss(2, "bob", 26));
        bossList.add(new Boss(3, "guy", 27));


        return bossList;
    }

    @GetMapping("/boss/{bossID}")
    public Boss getBosswithID(@PathVariable Integer bossID){
        //Return a hardcoded data from the list, a real world application will return from the dataset taht will be deployed to a server (virtual machine) or a server
        return new Boss(5, "Mr Bean", 44);
    }

    @PostMapping("/boss/newBoss")
    public void addPerson(@RequestBody Boss boss){
        //Return a hardcoded data from the list, a real world application will return from the dataset taht will be deployed to a server (virtual machine) or a server
        System.out.println("Saving Boss Information to the Database");
    }
}
