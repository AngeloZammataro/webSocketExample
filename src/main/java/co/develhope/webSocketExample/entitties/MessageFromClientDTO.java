package co.develhope.webSocketExample.entitties;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class MessageFromClientDTO {
    private String from;
    private String text;
}
