package yufucn.lowcode.daas.application.dtos;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

/**
 * @author wang
 * @date 2023/1/7 14:27
 */
@Getter
@Setter
public class DataSourceCreateDto {
    private String name;
    @NotNull
    private String driverClassName;
    @NotNull
    private String url;
    @NotNull
    private String userName;
    @NotNull
    private String password;
}
