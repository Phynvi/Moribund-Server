package com.github.moribund.net.packets.data;

import lombok.Value;

import java.io.Serializable;

@Value
public class PlayerRotationData implements Serializable {
    private static final long serialVersionUID = 5508611406619988854L;

    private int playerId;
    private float angle;
}