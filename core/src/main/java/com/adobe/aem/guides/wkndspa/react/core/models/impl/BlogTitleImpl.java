package com.adobe.aem.guides.wkndspa.react.core.models.impl;

import com.adobe.aem.guides.wkndspa.react.core.models.BlogTitle;
import com.adobe.aem.spa.project.core.models.Page;
import com.adobe.cq.export.json.ComponentExporter;
import com.adobe.cq.export.json.ExporterConstants;
import com.adobe.cq.wcm.core.components.commons.link.Link;
import com.adobe.cq.wcm.core.components.models.Title;
import com.adobe.cq.wcm.core.components.models.datalayer.ComponentData;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Exporter;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.Via;
import org.apache.sling.models.annotations.injectorspecific.ScriptVariable;
import org.apache.sling.models.annotations.injectorspecific.Self;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.apache.sling.models.annotations.via.ResourceSuperType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Model(adaptables = SlingHttpServletRequest.class,
        adapters = {BlogTitle.class, ComponentExporter.class},
        resourceType = BlogTitleImpl.RESOURCE_TYPE,
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
@Exporter(name = ExporterConstants.SLING_MODEL_EXPORTER_NAME, extensions = ExporterConstants.SLING_MODEL_EXTENSION)
public class BlogTitleImpl implements BlogTitle {

    public static final String RESOURCE_TYPE = "wknd-spa-react/components/blogtitle";

    @ScriptVariable
    private Page currentPage;

    @Self @Via(type = ResourceSuperType.class)
    private Title title;

    @ValueMapValue
    private String author;

    public String getAuthor() {
        return author;
    }

    @Override
    public String getText() {
        return title.getText();
    }

    @Override
    public String getType() {
        return title.getType();
    }

    @Override
    @Nullable
    public Link getLink() {
        return title.getLink();
    }

    @Override
    @Deprecated
    public String getLinkURL() {
        return title.getLinkURL();
    }

    @Override
    public boolean isLinkDisabled() {
        return title.isLinkDisabled();
    }

    @Override
    @Nullable
    public String getId() {
        return title.getId();
    }

    @Override
    @JsonProperty("dataLayer")
    @Nullable
    public ComponentData getData() {
        return title.getData();
    }

    @Override
    @JsonProperty("appliedCssClassNames")
    @Nullable
    public String getAppliedCssClasses() {
        return title.getAppliedCssClasses();
    }

    @Override
    @NotNull
    public String getExportedType() {
        return RESOURCE_TYPE;
    }
}
