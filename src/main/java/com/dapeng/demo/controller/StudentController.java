package com.dapeng.demo.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api("对学生表CRUD")
@RestController
@RequestMapping("/student")
public class StudentController {

//    @Autowired
//    private StudentService studentService;

//    @ApiOperation("添加学生")
//    @PostMapping("/add")
//    public String add(@RequestBody StudentVo student){
//        Student stu = new Student();
//        stu.setName(student.getName());
//        stu.setAge(student.getAge());
//        stu.setClassname(student.getClassname());
//        return studentService.insert(stu)?"添加成功":"添加失败";
//    }
//
//    @ApiOperation("删除学生")
//    @DeleteMapping("/delete/{id}")
//    public String delete(@ApiParam("学生的主键id")@PathVariable(value = "id") Integer id){
//        return studentService.deleteById(id)?"删除成功":"删除失败";
//    }
//
//    @ApiOperation("修改学生")
//    @PostMapping("/update")
//    public String update(@RequestBody Student student){
//        return studentService.updateById(student)?"修改成功":"修改失败";
//    }
//
//    @ApiOperation(value = "查询学生")
//    @GetMapping("/list")
//    public List<Student> list(){
//        Wrapper<Student> wrapper = new EntityWrapper<>();
//        return studentService.selectList(wrapper);
//    }


}
