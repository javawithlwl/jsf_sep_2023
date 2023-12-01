package com.careerit.dm;

import org.flywaydb.core.Flyway;
import org.yaml.snakeyaml.Yaml;

public class DbMigrationManager {

    public static void main(String[] args) {
       /* System.out.println("Starting migration....");
        Flyway flyway = Flyway.configure()
                .dataSource(
                "jdbc:postgresql://dpg-ck4g4mk2kpls73dt13p0-a.oregon-postgres.render.com:5432/lwl_db",
                "dbuser", "JvL42pV5YmRGIcYhGmXooU8yRBAHm3zi")
                .load();
        flyway.migrate();*/
        migrate();

    }

    public static void migrate(){
        Yaml yaml = new Yaml();
        TenantMaster tenantMaster = yaml.loadAs(DbMigrationManager.class.getResourceAsStream("/tenant_db.yaml"), TenantMaster.class);
        tenantMaster.getTenants().forEach(tenantDetails -> {
            System.out.println("Migrating for tenant :"+tenantDetails.getName());
            Flyway flyway = Flyway.configure()
                   .dataSource(
                            tenantDetails.getDb().getUrl(),
                            tenantDetails.getDb().getUsername(),
                            tenantDetails.getDb().getPassword())
                    .load();
            flyway.migrate();
        });
    }
}
