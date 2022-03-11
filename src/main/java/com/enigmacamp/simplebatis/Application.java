package com.enigmacamp.simplebatis;

import com.enigmacamp.simplebatis.dao.OutletDao;
import com.enigmacamp.simplebatis.model.Outlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class Application implements CommandLineRunner {
    @Autowired
    OutletDao outletDao;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Java MyBatis");
        Outlet o = new Outlet();
        o.setRom("1");
        o.setDescription("outlet_group");
        List<Outlet> outletList = outletDao.getAllRomArea(o);
        for (Outlet outlet : outletList) {
            System.out.println(outlet.toString());
        }
    }
}
