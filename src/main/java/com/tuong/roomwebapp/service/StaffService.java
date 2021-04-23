package com.tuong.roomwebapp.service;

import com.tuong.roomwebapp.models.Staff;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
@Service
public class StaffService {
    private final static List<Staff> staffService = new ArrayList();
    static {
        staffService.add(new Staff("1","Staff A","P1"));
        staffService.add(new Staff("2","Staff B","P2"));
        staffService.add(new Staff("3","Staff C","P3"));
        staffService.add(new Staff("4","Staff D","P4"));
    }

    public List<Staff> getAllStaffService() {
        return staffService;
    }
}
