package com.account.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.account.dao.EventLoggingDao;
import com.account.model.EventLogging;

@Component
public class RecordEventService implements Runnable   {

	@Autowired
	private EventLoggingDao eventLoggingDao; 
	
	private EventLogging eventLogging;
	
	public void recordEvent(EventLogging logging)
	{
		this.eventLogging=logging;
	}
	
	@Override
	public void run() {
		if(true) {
			eventLoggingDao.save(eventLogging);			
		}
	}
	

	

}
