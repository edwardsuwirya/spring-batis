/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.enigmacamp.simplebatis.batismapper;

import com.enigmacamp.simplebatis.model.Outlet;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author edo
 */
@Mapper
public interface OutletMapper {

    List<Outlet> getAllOutletByRomArea(Outlet o);

    List<Outlet> getAllRomArea(Outlet o);

    List<Outlet> countActiveOutlet(Outlet o);
}
