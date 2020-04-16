package com.frgp.racing.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.frgp.f1telemetry.entity.PacketSessionData;
import com.frgp.racing.entity.TlmSession;
import com.frgp.racing.mapper.TlmSessionMapper;
import com.frgp.racing.service.ITlmSessionService;
import com.frgp.racing.util.Result;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 37
 * @since 2020-04-16
 */
@Service
public class TlmSessionServiceImpl extends ServiceImpl<TlmSessionMapper, TlmSession> implements ITlmSessionService {
    public Result addSession(PacketSessionData packetSessionData) {
        try {
            System.out.println(packetSessionData.toJSON());
            String id = packetSessionData.getHeader().getSessionUID() + "_" + packetSessionData.getHeader().getPlayerCarIndex() + "_" + packetSessionData.getHeader().getFrameIdentifier();
            TlmSession tlmSession = new TlmSession();
            tlmSession.setId(id);
            tlmSession.setWeather(packetSessionData.getWeather());
            tlmSession.setTrackTemperature(packetSessionData.getTrackTemperature());
            tlmSession.setAirTemperature(packetSessionData.getAirTemperature());
            tlmSession.setTotalLaps(packetSessionData.getTotalLaps());
            tlmSession.setTrackLength(packetSessionData.getTrackLength());
            tlmSession.setSessionType(packetSessionData.getSessionType());
            tlmSession.setTrackId(packetSessionData.getTrackId());
            tlmSession.setFormula(packetSessionData.getFormula());
            tlmSession.setSessionTimeLeft(packetSessionData.getSessionTimeLeft());
            tlmSession.setSessionDuration(packetSessionData.getSessionDuration());
            tlmSession.setPitSpeedLimit(packetSessionData.getPitSpeedLimit());
            tlmSession.setGamePaused(packetSessionData.getGamePaused());
            tlmSession.setSpectating(packetSessionData.getSpectating());
            tlmSession.setSpectatorCarIndex(packetSessionData.getSpectatorCarIndex());
            tlmSession.setSliProNativeSupport(packetSessionData.getSliProNativeSupport());
            tlmSession.setNumMarshalZones(packetSessionData.getNumMarshalZones());
            tlmSession.setSafetyCarStatus(packetSessionData.getSafetyCarStatus());
            tlmSession.setNetworkGame(packetSessionData.getNetworkGame());
            System.out.println(id);
            save(tlmSession);
            System.out.println(tlmSession);
            return Result.success(getById(id));
        } catch (Exception e) {
            System.out.println("error");
            System.out.println(e);
            return Result.fail(e.getCause().getMessage(), packetSessionData);
        }
    }
}
