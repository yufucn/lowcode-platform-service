drop table if exists id_name;

/*==============================================================*/
/* Table: sh_virtual_device                                     */
/*==============================================================*/
create table id_name
(
    id                   varchar(36) not null comment '主键',
    name              varchar(36) comment '名称',
    primary key (id)
);