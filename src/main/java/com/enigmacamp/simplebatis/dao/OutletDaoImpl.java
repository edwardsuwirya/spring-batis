/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.enigmacamp.simplebatis.dao;

import com.enigmacamp.simplebatis.batismapper.OutletMapper;
import com.enigmacamp.simplebatis.model.Outlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author edo
 */
@Repository
public class OutletDaoImpl implements OutletDao {

    @Autowired
    private OutletMapper om;

    public List<Outlet> getAllOutletByRomArea(Outlet o) {
        return om.getAllOutletByRomArea(o);
    }

    @Override
    public List<Outlet> getAllRomArea(Outlet o) {
        return om.getAllRomArea(o);
    }

    public List<Outlet> countActiveOutlet(Outlet o) {
        return om.countActiveOutlet(o);
    }
}
