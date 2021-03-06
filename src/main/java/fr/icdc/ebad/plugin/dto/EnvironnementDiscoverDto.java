package fr.icdc.ebad.plugin.dto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@EqualsAndHashCode(exclude = {"norme","id"})
@AllArgsConstructor
@NoArgsConstructor
@ToString(exclude = "norme")
@Builder
public class EnvironnementDiscoverDto {
    private String name;
    private String code;
    private String id;
    private String host;
    private String login;
    private String home;
    private String prefix;
    private OsKind kindOs;
    private NormeDiscoverDto norme;

    public enum OsKind {UNIX,WINDOWS,OTHER}
}
