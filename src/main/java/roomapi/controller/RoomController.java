package roomapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import roomapi.domain.Room;
import roomapi.domain.RoomType;

import java.util.ArrayList;
import java.util.List;

@RestController
public class RoomController
{
    @GetMapping("/rooms")
    @ResponseBody
    public List<Room> getRooms() {
        List<Room> rooms = new ArrayList<Room>();
        Room room = new Room();
        room.setDescription("Roomy");
        room.setMinimumPax(2);
        room.setMaximumPax(4);
        room.setRoomType(RoomType.KING_ROOM);
        rooms.add(room);

        return rooms;
    }

}