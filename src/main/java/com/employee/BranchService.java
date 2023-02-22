package com.employee;

import com.employee.model.BranchModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class BranchService {
List<BranchModel> brachList;

    public BranchService() {
        brachList=new ArrayList<>();
        brachList.add(new BranchModel(1L,"C1022I1"));
        brachList.add(new BranchModel(2L,"C1122I1"));
    }
    public List<BranchModel> findAll(){
        return brachList;
    }
}
