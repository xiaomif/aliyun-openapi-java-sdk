/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.ledgerdb.model.v20191122;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetJournalRequest extends RpcAcsRequest<GetJournalResponse> {
	   

	private Long journalId;

	private String ledgerId;
	public GetJournalRequest() {
		super("ledgerdb", "2019-11-22", "GetJournal", "ledgerdb");
		setMethod(MethodType.GET);
	}

	public Long getJournalId() {
		return this.journalId;
	}

	public void setJournalId(Long journalId) {
		this.journalId = journalId;
		if(journalId != null){
			putQueryParameter("JournalId", journalId.toString());
		}
	}

	public String getLedgerId() {
		return this.ledgerId;
	}

	public void setLedgerId(String ledgerId) {
		this.ledgerId = ledgerId;
		if(ledgerId != null){
			putQueryParameter("LedgerId", ledgerId);
		}
	}

	@Override
	public Class<GetJournalResponse> getResponseClass() {
		return GetJournalResponse.class;
	}

}
