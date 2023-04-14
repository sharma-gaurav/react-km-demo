package com.adobe.aem.guides.wkndspa.react.core.models;

import com.adobe.cq.export.json.ComponentExporter;
import com.adobe.cq.export.json.ExporterConstants;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Exporter;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = SlingHttpServletRequest.class, adapters = { CustomBannerComponentModel.class,
        ComponentExporter.class }, resourceType = CustomBannerComponentModel.RESOURCE_TYPE, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
@Exporter(name = ExporterConstants.SLING_MODEL_EXPORTER_NAME, extensions = ExporterConstants.SLING_MODEL_EXTENSION)
public class CustomBannerComponentModel implements ComponentExporter {

    @ValueMapValue
    private String title;

    @ValueMapValue
    private String imageURL;

    static final String RESOURCE_TYPE = "wknd-spa-react/components/custom-banner";

    public String getTitle() {
        return title;
    }

    public String getImageURL() {
        return imageURL;
    }
    @Override
    public String getExportedType() {
        return CustomBannerComponentModel.RESOURCE_TYPE;
    }
}
