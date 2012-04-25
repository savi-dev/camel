// Copyright (c) 2012, The SAVI Project.
package ca.savi.camel.service.example;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * A multiplication result.
 *
 * @author Soheil Hassas Yeganeh <soheil@cs.toronto.edu>
 */
@XmlRootElement(name = "Result")
public class Result {
  @XmlElement
  List<String> operands;

  @XmlElement
  String result;

  public Result() {}

  public Result(List<String> operands, String result) {
    this.result = result;
    this.operands = operands;
  }
}
