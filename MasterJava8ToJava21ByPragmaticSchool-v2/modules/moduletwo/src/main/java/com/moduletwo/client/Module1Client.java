package com.moduletwo.client;

import com.moduleone.dtos.Module1DTO;

public class Module1Client {
    private final Module1Client module1Client;

    public Module1Client(Module1Client module1Client) {
        this.module1Client = module1Client;
    }
    public Module1DTO retrieveData() {

        return module1Client.retrieveData();
    }
}
