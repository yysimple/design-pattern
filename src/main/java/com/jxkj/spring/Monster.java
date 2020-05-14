package com.jxkj.spring;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 功能描述：
 *
 * @author wcx
 * @version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Monster {

    private Integer id = 10;

    private String name = "wcx";

    private Integer age = 18;

}
