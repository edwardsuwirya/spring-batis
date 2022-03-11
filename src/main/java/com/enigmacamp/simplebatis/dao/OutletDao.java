/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.enigmacamp.simplebatis.dao;

import com.enigmacamp.simplebatis.model.Outlet;

import java.util.List;

/**
 * @author edo
 */
public interface OutletDao {

    List<Outlet> getAllOutletByRomArea(Outlet o);

    List<Outlet> getAllRomArea(Outlet o);

    List<Outlet> countActiveOutlet(Outlet o);
}
