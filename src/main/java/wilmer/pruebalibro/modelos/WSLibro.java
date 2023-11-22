package wilmer.pruebalibro.modelos;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class WSLibro {
    @JsonProperty("wsid")
    private Long wsid;

    @JsonProperty("wstitulo")
    private String wstitulo;

    @JsonProperty("wsautor")
    private String wsautor;
}
