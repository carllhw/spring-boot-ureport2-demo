package script.db

databaseChangeLog(logicalFilePath: 'task.groovy') {
    changeSet(author:'carllhw@gmail.com', id:'2018-09-13') {
        createTable(tableName: "task") {
            column(name: 'task_id',            type: 'INT(11)',   autoIncrement: true,  remarks: '任务ID ') {
                constraints(primaryKey: true)
            }
            column(name: 'task_number',        type: 'VARCHAR(64)', remarks: '任务编号') {
                constraints(nullable: false)
            }
            column(name: 'task_description',   type: 'VARCHAR(256)', remarks: '任务描述')
            column(name: 'user_id',            type: 'INT(11)',   remarks: '用户ID') {
                constraints(nullable: false)
            }
            column(name: 'state',              type: 'VARCHAR(36)',defaultValue: 'CREATED',  remarks: '状态  ') {
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
        createIndex(indexName: "task_number", tableName: "task",unique: "true") {
            column(name: 'task_number')
        }
    }
}
