package com.sunbeaminfo.curiositees.admin;
/**
 * @author : Vedant Chimote
 * @mailto : vedantc.code@gmail.com
 * @created : 23-04-2024, Tuesday
 * @Time : 05:22 pm
 **/

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * This class is used to handle the requests for the home page
 */
@Controller
public class MainController {

  /**
   * This method is used to return the view for the home page
   * @return the view for the home page
   */
  @GetMapping("")

  public String viewHomePage() {
    return "index";
  }

}

