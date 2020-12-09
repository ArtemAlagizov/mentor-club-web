package com.mentor.club.repository;

import com.mentor.club.model.authentication.token.RefreshToken;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface IRefreshTokenRepository extends IJwtTokenRepository<RefreshToken> {
    Optional<RefreshToken> findByTokenAndDeviceId(@Param("token") String token, @Param("deviceId") UUID deviceId);
}