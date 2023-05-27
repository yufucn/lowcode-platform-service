package yufucn.lowcode.daas.application.convert;

import javax.annotation.Generated;
import yufucn.lowcode.daas.application.dtos.DataSourceCreateDto;
import yufucn.lowcode.daas.application.dtos.DataSourceDto;
import yufucn.lowcode.daas.domain.datasource.DataSource;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-05-27T22:04:13+0800",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 1.8.0_211 (Oracle Corporation)"
)
public class DataSourceConvertImpl implements DataSourceConvert {

    @Override
    public DataSourceDto mapToGetOutputDto(DataSource entity) {
        if ( entity == null ) {
            return null;
        }

        String name = null;

        name = entity.getName();

        DataSourceDto dataSourceDto = new DataSourceDto( name );

        dataSourceDto.setId( entity.getId() );
        dataSourceDto.setCreationTime( entity.getCreationTime() );
        dataSourceDto.setCreatorId( entity.getCreatorId() );
        dataSourceDto.setLastModificationTime( entity.getLastModificationTime() );
        dataSourceDto.setLastModifierId( entity.getLastModifierId() );

        return dataSourceDto;
    }

    @Override
    public DataSourceDto mapToGetListOutputDto(DataSource entity) {
        if ( entity == null ) {
            return null;
        }

        String name = null;

        name = entity.getName();

        DataSourceDto dataSourceDto = new DataSourceDto( name );

        dataSourceDto.setId( entity.getId() );
        dataSourceDto.setCreationTime( entity.getCreationTime() );
        dataSourceDto.setCreatorId( entity.getCreatorId() );
        dataSourceDto.setLastModificationTime( entity.getLastModificationTime() );
        dataSourceDto.setLastModifierId( entity.getLastModifierId() );

        return dataSourceDto;
    }

    @Override
    public DataSource mapToEntity(DataSourceCreateDto createInput) {
        if ( createInput == null ) {
            return null;
        }

        DataSource dataSource = new DataSource();

        dataSource.setName( createInput.getName() );

        return dataSource;
    }

    @Override
    public void mapToEntity(DataSourceCreateDto arg0, DataSource arg1) {
        if ( arg0 == null ) {
            return;
        }

        arg1.setName( arg0.getName() );
    }
}
