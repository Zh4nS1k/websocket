package kz.narxoz.middle02.middle02websocket.message;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CustomMessage {
    private String type;
    private String content;
}
