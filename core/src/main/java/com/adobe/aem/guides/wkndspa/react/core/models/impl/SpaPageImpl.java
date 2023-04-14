package com.adobe.aem.guides.wkndspa.react.core.models.impl;

import com.adobe.aem.spa.project.core.models.Page;
import com.adobe.cq.export.json.ComponentExporter;
import com.adobe.cq.export.json.ContainerExporter;
import com.adobe.cq.export.json.ExporterConstants;
import com.adobe.cq.export.json.hierarchy.HierarchyNodeExporter;
import com.adobe.cq.wcm.core.components.models.HtmlPageItem;
import com.adobe.cq.wcm.core.components.models.NavigationItem;
import com.adobe.cq.wcm.core.components.models.datalayer.ComponentData;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.StringUtils;
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

import java.util.*;

@Model(
        adaptables = SlingHttpServletRequest.class,
        adapters = {Page.class, ContainerExporter.class},
        resourceType = SpaPageImpl.RESOURCE_TYPE,
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
@Exporter(name = ExporterConstants.SLING_MODEL_EXPORTER_NAME, extensions = ExporterConstants.SLING_MODEL_EXTENSION)
public class SpaPageImpl implements Page {
    public static final String RESOURCE_TYPE = "wknd-spa-react/components/page";
    @Self
    @Via(type = ResourceSuperType.class)
    protected Page delegate;

    @ScriptVariable
    protected com.day.cq.wcm.api.Page currentPage;

    @ValueMapValue(name = "newProp")
    private String customProp;

//    @Override
    public String getCustomProp() {
        String newProp = currentPage.getProperties().get("newProp", String.class);
        return StringUtils.defaultIfEmpty(customProp, StringUtils.EMPTY);
    }

    @Override
    @NotNull
    public String getExportedType() {
        return SpaPageImpl.RESOURCE_TYPE;
    }

    @Override
    @JsonIgnore
    @Nullable
    public String getHierarchyRootJsonExportUrl() {
        return delegate.getHierarchyRootJsonExportUrl();
    }

    @Override
    @JsonIgnore
    @Nullable
    public Page getHierarchyRootModel() {
        return delegate.getHierarchyRootModel();
    }

    @Override
    @NotNull
    public String[] getExportedItemsOrder() {
        return delegate.getExportedItemsOrder();
    }

    @Override
    @NotNull
    public Map<String, ? extends ComponentExporter> getExportedItems() {
        return delegate.getExportedItems();
    }

    @Override
    public String getExportedHierarchyType() {
        return delegate.getExportedHierarchyType();
    }

    @Override
    public String getExportedPath() {
        return delegate.getExportedPath();
    }

    @Override
    public Map<String, ? extends HierarchyNodeExporter> getExportedChildren() {
        return delegate.getExportedChildren();
    }

    @Override
    public String getLanguage() {
        return delegate.getLanguage();
    }

    @Override
    public Calendar getLastModifiedDate() {
        return delegate.getLastModifiedDate();
    }

    @Override
    @JsonIgnore
    public String[] getKeywords() {
        return delegate.getKeywords();
    }

    @Override
    public String getDesignPath() {
        return delegate.getDesignPath();
    }

    @Override
    public String getStaticDesignPath() {
        return delegate.getStaticDesignPath();
    }

    @Override
    @JsonIgnore
    @Deprecated
    public Map<String, String> getFavicons() {
        return delegate.getFavicons();
    }

    @Override
    public String getTitle() {
        return delegate.getTitle();
    }

    @Override
    public String getDescription() {
        return delegate.getDescription();
    }

    @Override
    public String getBrandSlug() {
        return delegate.getBrandSlug();
    }

    @Override
    @JsonIgnore
    public String[] getClientLibCategories() {
        return delegate.getClientLibCategories();
    }

    @Override
    @JsonIgnore
    public String[] getClientLibCategoriesJsBody() {
        return delegate.getClientLibCategoriesJsBody();
    }

    @Override
    @JsonIgnore
    public String[] getClientLibCategoriesJsHead() {
        return delegate.getClientLibCategoriesJsHead();
    }

    @Override
    public String getTemplateName() {
        return delegate.getTemplateName();
    }

    @Override
    @Nullable
    public String getAppResourcesPath() {
        return delegate.getAppResourcesPath();
    }

    @Override
    public String getCssClassNames() {
        return delegate.getCssClassNames();
    }

    @Override
    @Nullable
    public NavigationItem getRedirectTarget() {
        return delegate.getRedirectTarget();
    }

    @Override
    public boolean hasCloudconfigSupport() {
        return delegate.hasCloudconfigSupport();
    }

    @Override
    @NotNull
    public Set<String> getComponentsResourceTypes() {
        return delegate.getComponentsResourceTypes();
    }

    @Override
    @Nullable
    public String getMainContentSelector() {
        return delegate.getMainContentSelector();
    }

    @Override
    @Nullable
    public List<HtmlPageItem> getHtmlPageItems() {
        return delegate.getHtmlPageItems();
    }

    @Override
    @JsonIgnore
    @Nullable
    public String getCanonicalLink() {
        return delegate.getCanonicalLink();
    }

    @Override
    @JsonIgnore
    @NotNull
    public Map<Locale, String> getAlternateLanguageLinks() {
        return delegate.getAlternateLanguageLinks();
    }

    @Override
    @JsonIgnore
    @NotNull
    public List<String> getRobotsTags() {
        return delegate.getRobotsTags();
    }

    @Override
    @Nullable
    public String getId() {
        return delegate.getId();
    }

    @Override
    @JsonProperty("dataLayer")
    @Nullable
    public ComponentData getData() {
        return delegate.getData();
    }

    @Override
    @JsonProperty("appliedCssClassNames")
    @Nullable
    public String getAppliedCssClasses() {
        return delegate.getAppliedCssClasses();
    }
}