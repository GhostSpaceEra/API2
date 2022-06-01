package com.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    FetchData repository;

    Page<UserModel> employeeWithPagination(int offset,int pageSize){
        Page<UserModel> employees = repository.findAll(PageRequest.of(offset,pageSize,Sort.by("firstname")));
        return employees;
    }

}