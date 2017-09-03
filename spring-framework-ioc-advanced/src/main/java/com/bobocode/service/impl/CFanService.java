package com.bobocode.service.impl;

import com.bobocode.service.TalkingService;
import org.springframework.stereotype.Service;

@Service("talkingService")
public class CFanService implements TalkingService {
    @Override
    public String saySomething() {
        return "I like C, and I don't care...";
    }
}
