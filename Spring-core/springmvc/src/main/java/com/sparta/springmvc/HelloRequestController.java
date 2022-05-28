package com.sparta.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller //  Controller라는 것을 명시
@RequestMapping("/hello/request")   //  공통 주소
public class HelloRequestController {
    @GetMapping("/form/html")   //  () 주소로 요청시
    public String helloForm() {
        return "hello-request-form";    //  template의 hello-request-form 호출
    }

    // [Request sample]
    // GET http://localhost:8080/hello/request/star/BTS/age/28
    @GetMapping("/star/{name}/age/{age}")   //  () 주소로 요청시
    @ResponseBody
    public String helloRequestPath(@PathVariable String name, @PathVariable int age) {
        //  PathVariable = url에 들어가 있는 정보 가져오는것

        return String.format("Hello, @PathVariable.<br> name = %s, age = %d", name, age);
        //  변수 %s, %d에 name과 age의 값을 매치
    }

    // [Request sample]
    // GET http://localhost:8080/hello/request/form/param?name=BTS&age=28
    //
    @GetMapping("/form/param")
    @ResponseBody
    public String helloGetRequestParam(@RequestParam String name, @RequestParam int age) {
        return String.format("Hello, @RequestParam.<br> name = %s, age = %d", name, age);
    }

    // [Request sample]
    // POST http://localhost:8080/hello/request/form/param
    // Header
    //  Content type: application/x-www-form-urlencoded
    // Body
    //  name=BTS&age=28
    @PostMapping("/form/param")
    @ResponseBody
    public String helloPostRequestParam(@RequestParam String name, @RequestParam int age) { // @RequestParam을 통해서 하나씩 값 불러오기
        // @RequestParam 은 생략 가능
        return String.format("Hello, @RequestParam.<br> name = %s, age = %d", name, age);
    }

    // [Request sample]
    // POST http://localhost:8080/hello/request/form/model
    // Header
    //  Content type: application/x-www-form-urlencoded
    // Body
    //  name=BTS&age=28
    @PostMapping("/form/model")
    @ResponseBody
    public String helloRequestBodyForm(@ModelAttribute Star star) {
        //  @ModelAttribute를 이용해서 Star 객체를 만들고 그 객체의 값을 가져와서 설정

        return String.format("Hello, @RequestBody.<br> (name = %s, age = %d) ", star.name, star.age);
    }

    // [Request sample]
    // POST http://localhost:8080/hello/request/form/json
    // Header
    //  Content type: application/json
    // Body
    //  {"name":"BTS","age":"28"}
    @PostMapping("/form/json")
    @ResponseBody
    public String helloPostRequestJson(@RequestBody Star star) {
        return String.format("Hello, @RequestBody.<br> (name = %s, age = %d) ", star.name, star.age);
    }
}
