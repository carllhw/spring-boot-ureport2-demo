package script.db

databaseChangeLog(logicalFilePath: 'user.groovy') {
    changeSet(author:'carllhw@gmail.com', id:'2018-09-13') {
        createTable(tableName: "user") {
            column(name: 'user_id',     type: 'INT(11)',   autoIncrement: true,  remarks: '用户ID ') {
                constraints(primaryKey: true)
            }
            column(name: 'user_name',   type: 'VARCHAR(255)', remarks: '用户名') {
                constraints(nullable: false)
            }
            column(name: 'status',      type: 'VARCHAR(15)',defaultValue: 'ACTIVE',   remarks: '用户状态  ') {
                constraints(nullable: false)
            }
            column(name: 'nickname',    type: 'VARCHAR(255)',defaultValue: 'none',     remarks: '')
            column(name: 'email',       type: 'VARCHAR(32)', remarks: '邮箱') {
                constraints(nullable: false)
            }
            column(name: 'created_by',           type: 'varchar(60)', defaultValue: '-1') {
                constraints(nullable: false)
            }
            column(name: 'creation_date',        type: 'datetime', defaultValueComputed: "CURRENT_TIMESTAMP") {
                constraints(nullable: false)
            }
            column(name: 'last_updated_by',      type: 'varchar(60)', defaultValue: '-1') {
                constraints(nullable: false)
            }
            column(name: 'last_update_date',     type: 'datetime', defaultValueComputed: "CURRENT_TIMESTAMP") {
                constraints(nullable: false)
            }
            column(name: 'object_version_number',type: 'bigint(20)', defaultValue: "1") {
                constraints(nullable: false)
            }
        }
        createIndex(indexName: "user_name", tableName: "user",unique: "true") {
            column(name: 'user_name')
        }
    }
}
