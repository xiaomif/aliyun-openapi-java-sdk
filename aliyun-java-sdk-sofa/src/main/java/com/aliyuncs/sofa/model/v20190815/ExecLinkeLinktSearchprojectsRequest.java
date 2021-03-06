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

package com.aliyuncs.sofa.model.v20190815;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sofa.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ExecLinkeLinktSearchprojectsRequest extends RpcAcsRequest<ExecLinkeLinktSearchprojectsResponse> {
	   

	private String pageSize;

	private String includeArchived;

	private String keyword;

	private String onlyParticipated;

	private String page;

	private String roleControl;
	public ExecLinkeLinktSearchprojectsRequest() {
		super("SOFA", "2019-08-15", "ExecLinkeLinktSearchprojects", "sofa");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putBodyParameter("PageSize", pageSize);
		}
	}

	public String getIncludeArchived() {
		return this.includeArchived;
	}

	public void setIncludeArchived(String includeArchived) {
		this.includeArchived = includeArchived;
		if(includeArchived != null){
			putBodyParameter("IncludeArchived", includeArchived);
		}
	}

	public String getKeyword() {
		return this.keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
		if(keyword != null){
			putBodyParameter("Keyword", keyword);
		}
	}

	public String getOnlyParticipated() {
		return this.onlyParticipated;
	}

	public void setOnlyParticipated(String onlyParticipated) {
		this.onlyParticipated = onlyParticipated;
		if(onlyParticipated != null){
			putBodyParameter("OnlyParticipated", onlyParticipated);
		}
	}

	public String getPage() {
		return this.page;
	}

	public void setPage(String page) {
		this.page = page;
		if(page != null){
			putBodyParameter("Page", page);
		}
	}

	public String getRoleControl() {
		return this.roleControl;
	}

	public void setRoleControl(String roleControl) {
		this.roleControl = roleControl;
		if(roleControl != null){
			putBodyParameter("RoleControl", roleControl);
		}
	}

	@Override
	public Class<ExecLinkeLinktSearchprojectsResponse> getResponseClass() {
		return ExecLinkeLinktSearchprojectsResponse.class;
	}

}
