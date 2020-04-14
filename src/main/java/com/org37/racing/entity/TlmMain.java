package com.org37.racing.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author 37
 * @since 2020-04-14
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class TlmMain extends RcBase {

    private static final long serialVersionUID = 1L;

    private String id;


}
