package com.api.async;

import org.springframework.boot.CommandLineRunner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import java.util.concurrent.CompletableFuture;

@Component
public class PushMessageRunner implements CommandLineRunner {
	
	 private static final Logger LOG = LoggerFactory.getLogger(PushMessageRunner.class);

	@Override
	public void run(String... args) throws Exception {
		// Start the clock
        long start = System.currentTimeMillis();
		LOG.info("Called Method at "+start);
		// End the clock
        long end = System.currentTimeMillis();
        LOG.info("End Method at "+end);
	}

}
