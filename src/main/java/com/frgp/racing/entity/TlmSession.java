package com.frgp.racing.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author 37
 * @since 2020-04-16
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class TlmSession extends RcBase {

    private static final long serialVersionUID = 1L;

    private String id;

    private Integer weather;

    private Integer trackTemperature;

    private Integer airTemperature;

    private Integer totalLaps;

    private Integer trackLength;

    private Integer sessionType;

    private Integer trackId;

    private Integer formula;

    private Integer sessionTimeLeft;

    private Integer sessionDuration;

    private Integer pitSpeedLimit;

    private Boolean gamePaused;

    private Boolean spectating;

    private Integer spectatorCarIndex;

    private Boolean sliProNativeSupport;

    private Integer numMarshalZones;

    private Integer safetyCarStatus;

    private Boolean networkGame;


}
