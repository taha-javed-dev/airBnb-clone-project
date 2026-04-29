package com.learning.projects.airBnbApp.service;

import com.learning.projects.airBnbApp.entity.Room;

public interface InventoryService {

    void initializeRoomForAYear(Room room);

    void deleteFutureInventories(Room room);

}