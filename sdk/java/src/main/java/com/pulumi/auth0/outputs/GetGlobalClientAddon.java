// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.outputs;

import com.pulumi.auth0.outputs.GetGlobalClientAddonSamlp;
import com.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetGlobalClientAddon {
    private final Map<String,Object> aws;
    private final Map<String,Object> azureBlob;
    private final Map<String,Object> azureSb;
    private final Map<String,Object> box;
    private final Map<String,Object> cloudbees;
    private final Map<String,Object> concur;
    private final Map<String,Object> dropbox;
    private final Map<String,Object> echosign;
    private final Map<String,Object> egnyte;
    private final Map<String,Object> firebase;
    private final Map<String,Object> layer;
    private final Map<String,Object> mscrm;
    private final Map<String,Object> newrelic;
    private final Map<String,Object> office365;
    private final Map<String,Object> rms;
    private final Map<String,Object> salesforce;
    private final Map<String,Object> salesforceApi;
    private final Map<String,Object> salesforceSandboxApi;
    private final List<GetGlobalClientAddonSamlp> samlps;
    private final Map<String,Object> sapApi;
    private final Map<String,Object> sentry;
    private final Map<String,Object> sharepoint;
    private final Map<String,Object> slack;
    private final Map<String,Object> springcm;
    private final Map<String,Object> wams;
    private final Map<String,Object> wsfed;
    private final Map<String,Object> zendesk;
    private final Map<String,Object> zoom;

    @CustomType.Constructor
    private GetGlobalClientAddon(
        @CustomType.Parameter("aws") Map<String,Object> aws,
        @CustomType.Parameter("azureBlob") Map<String,Object> azureBlob,
        @CustomType.Parameter("azureSb") Map<String,Object> azureSb,
        @CustomType.Parameter("box") Map<String,Object> box,
        @CustomType.Parameter("cloudbees") Map<String,Object> cloudbees,
        @CustomType.Parameter("concur") Map<String,Object> concur,
        @CustomType.Parameter("dropbox") Map<String,Object> dropbox,
        @CustomType.Parameter("echosign") Map<String,Object> echosign,
        @CustomType.Parameter("egnyte") Map<String,Object> egnyte,
        @CustomType.Parameter("firebase") Map<String,Object> firebase,
        @CustomType.Parameter("layer") Map<String,Object> layer,
        @CustomType.Parameter("mscrm") Map<String,Object> mscrm,
        @CustomType.Parameter("newrelic") Map<String,Object> newrelic,
        @CustomType.Parameter("office365") Map<String,Object> office365,
        @CustomType.Parameter("rms") Map<String,Object> rms,
        @CustomType.Parameter("salesforce") Map<String,Object> salesforce,
        @CustomType.Parameter("salesforceApi") Map<String,Object> salesforceApi,
        @CustomType.Parameter("salesforceSandboxApi") Map<String,Object> salesforceSandboxApi,
        @CustomType.Parameter("samlps") List<GetGlobalClientAddonSamlp> samlps,
        @CustomType.Parameter("sapApi") Map<String,Object> sapApi,
        @CustomType.Parameter("sentry") Map<String,Object> sentry,
        @CustomType.Parameter("sharepoint") Map<String,Object> sharepoint,
        @CustomType.Parameter("slack") Map<String,Object> slack,
        @CustomType.Parameter("springcm") Map<String,Object> springcm,
        @CustomType.Parameter("wams") Map<String,Object> wams,
        @CustomType.Parameter("wsfed") Map<String,Object> wsfed,
        @CustomType.Parameter("zendesk") Map<String,Object> zendesk,
        @CustomType.Parameter("zoom") Map<String,Object> zoom) {
        this.aws = aws;
        this.azureBlob = azureBlob;
        this.azureSb = azureSb;
        this.box = box;
        this.cloudbees = cloudbees;
        this.concur = concur;
        this.dropbox = dropbox;
        this.echosign = echosign;
        this.egnyte = egnyte;
        this.firebase = firebase;
        this.layer = layer;
        this.mscrm = mscrm;
        this.newrelic = newrelic;
        this.office365 = office365;
        this.rms = rms;
        this.salesforce = salesforce;
        this.salesforceApi = salesforceApi;
        this.salesforceSandboxApi = salesforceSandboxApi;
        this.samlps = samlps;
        this.sapApi = sapApi;
        this.sentry = sentry;
        this.sharepoint = sharepoint;
        this.slack = slack;
        this.springcm = springcm;
        this.wams = wams;
        this.wsfed = wsfed;
        this.zendesk = zendesk;
        this.zoom = zoom;
    }

    public Map<String,Object> aws() {
        return this.aws;
    }
    public Map<String,Object> azureBlob() {
        return this.azureBlob;
    }
    public Map<String,Object> azureSb() {
        return this.azureSb;
    }
    public Map<String,Object> box() {
        return this.box;
    }
    public Map<String,Object> cloudbees() {
        return this.cloudbees;
    }
    public Map<String,Object> concur() {
        return this.concur;
    }
    public Map<String,Object> dropbox() {
        return this.dropbox;
    }
    public Map<String,Object> echosign() {
        return this.echosign;
    }
    public Map<String,Object> egnyte() {
        return this.egnyte;
    }
    public Map<String,Object> firebase() {
        return this.firebase;
    }
    public Map<String,Object> layer() {
        return this.layer;
    }
    public Map<String,Object> mscrm() {
        return this.mscrm;
    }
    public Map<String,Object> newrelic() {
        return this.newrelic;
    }
    public Map<String,Object> office365() {
        return this.office365;
    }
    public Map<String,Object> rms() {
        return this.rms;
    }
    public Map<String,Object> salesforce() {
        return this.salesforce;
    }
    public Map<String,Object> salesforceApi() {
        return this.salesforceApi;
    }
    public Map<String,Object> salesforceSandboxApi() {
        return this.salesforceSandboxApi;
    }
    public List<GetGlobalClientAddonSamlp> samlps() {
        return this.samlps;
    }
    public Map<String,Object> sapApi() {
        return this.sapApi;
    }
    public Map<String,Object> sentry() {
        return this.sentry;
    }
    public Map<String,Object> sharepoint() {
        return this.sharepoint;
    }
    public Map<String,Object> slack() {
        return this.slack;
    }
    public Map<String,Object> springcm() {
        return this.springcm;
    }
    public Map<String,Object> wams() {
        return this.wams;
    }
    public Map<String,Object> wsfed() {
        return this.wsfed;
    }
    public Map<String,Object> zendesk() {
        return this.zendesk;
    }
    public Map<String,Object> zoom() {
        return this.zoom;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGlobalClientAddon defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,Object> aws;
        private Map<String,Object> azureBlob;
        private Map<String,Object> azureSb;
        private Map<String,Object> box;
        private Map<String,Object> cloudbees;
        private Map<String,Object> concur;
        private Map<String,Object> dropbox;
        private Map<String,Object> echosign;
        private Map<String,Object> egnyte;
        private Map<String,Object> firebase;
        private Map<String,Object> layer;
        private Map<String,Object> mscrm;
        private Map<String,Object> newrelic;
        private Map<String,Object> office365;
        private Map<String,Object> rms;
        private Map<String,Object> salesforce;
        private Map<String,Object> salesforceApi;
        private Map<String,Object> salesforceSandboxApi;
        private List<GetGlobalClientAddonSamlp> samlps;
        private Map<String,Object> sapApi;
        private Map<String,Object> sentry;
        private Map<String,Object> sharepoint;
        private Map<String,Object> slack;
        private Map<String,Object> springcm;
        private Map<String,Object> wams;
        private Map<String,Object> wsfed;
        private Map<String,Object> zendesk;
        private Map<String,Object> zoom;

        public Builder() {
    	      // Empty
        }

        public Builder(GetGlobalClientAddon defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aws = defaults.aws;
    	      this.azureBlob = defaults.azureBlob;
    	      this.azureSb = defaults.azureSb;
    	      this.box = defaults.box;
    	      this.cloudbees = defaults.cloudbees;
    	      this.concur = defaults.concur;
    	      this.dropbox = defaults.dropbox;
    	      this.echosign = defaults.echosign;
    	      this.egnyte = defaults.egnyte;
    	      this.firebase = defaults.firebase;
    	      this.layer = defaults.layer;
    	      this.mscrm = defaults.mscrm;
    	      this.newrelic = defaults.newrelic;
    	      this.office365 = defaults.office365;
    	      this.rms = defaults.rms;
    	      this.salesforce = defaults.salesforce;
    	      this.salesforceApi = defaults.salesforceApi;
    	      this.salesforceSandboxApi = defaults.salesforceSandboxApi;
    	      this.samlps = defaults.samlps;
    	      this.sapApi = defaults.sapApi;
    	      this.sentry = defaults.sentry;
    	      this.sharepoint = defaults.sharepoint;
    	      this.slack = defaults.slack;
    	      this.springcm = defaults.springcm;
    	      this.wams = defaults.wams;
    	      this.wsfed = defaults.wsfed;
    	      this.zendesk = defaults.zendesk;
    	      this.zoom = defaults.zoom;
        }

        public Builder aws(Map<String,Object> aws) {
            this.aws = Objects.requireNonNull(aws);
            return this;
        }
        public Builder azureBlob(Map<String,Object> azureBlob) {
            this.azureBlob = Objects.requireNonNull(azureBlob);
            return this;
        }
        public Builder azureSb(Map<String,Object> azureSb) {
            this.azureSb = Objects.requireNonNull(azureSb);
            return this;
        }
        public Builder box(Map<String,Object> box) {
            this.box = Objects.requireNonNull(box);
            return this;
        }
        public Builder cloudbees(Map<String,Object> cloudbees) {
            this.cloudbees = Objects.requireNonNull(cloudbees);
            return this;
        }
        public Builder concur(Map<String,Object> concur) {
            this.concur = Objects.requireNonNull(concur);
            return this;
        }
        public Builder dropbox(Map<String,Object> dropbox) {
            this.dropbox = Objects.requireNonNull(dropbox);
            return this;
        }
        public Builder echosign(Map<String,Object> echosign) {
            this.echosign = Objects.requireNonNull(echosign);
            return this;
        }
        public Builder egnyte(Map<String,Object> egnyte) {
            this.egnyte = Objects.requireNonNull(egnyte);
            return this;
        }
        public Builder firebase(Map<String,Object> firebase) {
            this.firebase = Objects.requireNonNull(firebase);
            return this;
        }
        public Builder layer(Map<String,Object> layer) {
            this.layer = Objects.requireNonNull(layer);
            return this;
        }
        public Builder mscrm(Map<String,Object> mscrm) {
            this.mscrm = Objects.requireNonNull(mscrm);
            return this;
        }
        public Builder newrelic(Map<String,Object> newrelic) {
            this.newrelic = Objects.requireNonNull(newrelic);
            return this;
        }
        public Builder office365(Map<String,Object> office365) {
            this.office365 = Objects.requireNonNull(office365);
            return this;
        }
        public Builder rms(Map<String,Object> rms) {
            this.rms = Objects.requireNonNull(rms);
            return this;
        }
        public Builder salesforce(Map<String,Object> salesforce) {
            this.salesforce = Objects.requireNonNull(salesforce);
            return this;
        }
        public Builder salesforceApi(Map<String,Object> salesforceApi) {
            this.salesforceApi = Objects.requireNonNull(salesforceApi);
            return this;
        }
        public Builder salesforceSandboxApi(Map<String,Object> salesforceSandboxApi) {
            this.salesforceSandboxApi = Objects.requireNonNull(salesforceSandboxApi);
            return this;
        }
        public Builder samlps(List<GetGlobalClientAddonSamlp> samlps) {
            this.samlps = Objects.requireNonNull(samlps);
            return this;
        }
        public Builder samlps(GetGlobalClientAddonSamlp... samlps) {
            return samlps(List.of(samlps));
        }
        public Builder sapApi(Map<String,Object> sapApi) {
            this.sapApi = Objects.requireNonNull(sapApi);
            return this;
        }
        public Builder sentry(Map<String,Object> sentry) {
            this.sentry = Objects.requireNonNull(sentry);
            return this;
        }
        public Builder sharepoint(Map<String,Object> sharepoint) {
            this.sharepoint = Objects.requireNonNull(sharepoint);
            return this;
        }
        public Builder slack(Map<String,Object> slack) {
            this.slack = Objects.requireNonNull(slack);
            return this;
        }
        public Builder springcm(Map<String,Object> springcm) {
            this.springcm = Objects.requireNonNull(springcm);
            return this;
        }
        public Builder wams(Map<String,Object> wams) {
            this.wams = Objects.requireNonNull(wams);
            return this;
        }
        public Builder wsfed(Map<String,Object> wsfed) {
            this.wsfed = Objects.requireNonNull(wsfed);
            return this;
        }
        public Builder zendesk(Map<String,Object> zendesk) {
            this.zendesk = Objects.requireNonNull(zendesk);
            return this;
        }
        public Builder zoom(Map<String,Object> zoom) {
            this.zoom = Objects.requireNonNull(zoom);
            return this;
        }        public GetGlobalClientAddon build() {
            return new GetGlobalClientAddon(aws, azureBlob, azureSb, box, cloudbees, concur, dropbox, echosign, egnyte, firebase, layer, mscrm, newrelic, office365, rms, salesforce, salesforceApi, salesforceSandboxApi, samlps, sapApi, sentry, sharepoint, slack, springcm, wams, wsfed, zendesk, zoom);
        }
    }
}
