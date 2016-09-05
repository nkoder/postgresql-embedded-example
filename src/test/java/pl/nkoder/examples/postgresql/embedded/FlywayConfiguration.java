package pl.nkoder.examples.postgresql.embedded;

import org.flywaydb.core.Flyway;
import org.flywaydb.core.api.MigrationVersion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

import javax.sql.DataSource;

@Configuration
public class FlywayConfiguration {

    @Autowired
    DataSource dataSource;

    @Bean
    @DependsOn("dataSource")
    Flyway flyway() {
        Flyway flyway = new Flyway();
        flyway.setDataSource(dataSource);
        flyway.setLocations("classpath:db/migration");
        flyway.setTarget(MigrationVersion.fromVersion("1"));
        flyway.clean();
        flyway.migrate();
        return flyway;
    }
}
