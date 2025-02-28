//  Copyright 2021 Goldman Sachs
//
//  Licensed under the Apache License, Version 2.0 (the "License");
//  you may not use this file except in compliance with the License.
//  You may obtain a copy of the License at
//
//       http://www.apache.org/licenses/LICENSE-2.0
//
//  Unless required by applicable law or agreed to in writing, software
//  distributed under the License is distributed on an "AS IS" BASIS,
//  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
//  See the License for the specific language governing permissions and
//  limitations under the License.
//

package org.finos.legend.depot.store.model.projects;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.finos.legend.depot.store.model.HasIdentifier;
import org.finos.legend.depot.domain.CoordinateData;

@JsonIgnoreProperties(ignoreUnknown = true)
public class StoreProjectData extends CoordinateData implements HasIdentifier
{
    @JsonProperty
    private String defaultBranch;

    @JsonProperty
    private String projectId;

    @JsonProperty
    private String latestVersion;

    public StoreProjectData()
    {
        super();
    }

    public StoreProjectData(String projectId, String groupId, String artifactId, String defaultBranch, String latestVersion)
    {
        this(projectId, groupId, artifactId);
        this.defaultBranch = defaultBranch;
        this.latestVersion = latestVersion;
    }

    public StoreProjectData(String projectId,String groupId,String artifactId)
    {
        super(groupId, artifactId);
        this.projectId = projectId;
    }

    public String getDefaultBranch()
    {
        return defaultBranch;
    }

    public void setDefaultBranch(String defaultBranch)
    {
        this.defaultBranch = defaultBranch;
    }

    public String getProjectId()
    {
        return projectId;
    }

    public String getLatestVersion()
    {
        return latestVersion;
    }

    public void setLatestVersion(String latestVersion)
    {
        this.latestVersion = latestVersion;
    }

    @Override
    @JsonIgnore
    public String getId()
    {
        return "";
    }

    @Override
    public boolean equals(Object obj)
    {
        return EqualsBuilder.reflectionEquals(this, obj);
    }

    @Override
    public int hashCode()
    {
        return HashCodeBuilder.reflectionHashCode(this);
    }
}
