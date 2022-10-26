// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.inputs;

import com.pulumi.auth0.inputs.GlobalClientAddonsSamlpArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GlobalClientAddonsArgs extends com.pulumi.resources.ResourceArgs {

    public static final GlobalClientAddonsArgs Empty = new GlobalClientAddonsArgs();

    @Import(name="aws")
    private @Nullable Output<Map<String,Object>> aws;

    public Optional<Output<Map<String,Object>>> aws() {
        return Optional.ofNullable(this.aws);
    }

    @Import(name="azureBlob")
    private @Nullable Output<Map<String,Object>> azureBlob;

    public Optional<Output<Map<String,Object>>> azureBlob() {
        return Optional.ofNullable(this.azureBlob);
    }

    @Import(name="azureSb")
    private @Nullable Output<Map<String,Object>> azureSb;

    public Optional<Output<Map<String,Object>>> azureSb() {
        return Optional.ofNullable(this.azureSb);
    }

    @Import(name="box")
    private @Nullable Output<Map<String,Object>> box;

    public Optional<Output<Map<String,Object>>> box() {
        return Optional.ofNullable(this.box);
    }

    @Import(name="cloudbees")
    private @Nullable Output<Map<String,Object>> cloudbees;

    public Optional<Output<Map<String,Object>>> cloudbees() {
        return Optional.ofNullable(this.cloudbees);
    }

    @Import(name="concur")
    private @Nullable Output<Map<String,Object>> concur;

    public Optional<Output<Map<String,Object>>> concur() {
        return Optional.ofNullable(this.concur);
    }

    @Import(name="dropbox")
    private @Nullable Output<Map<String,Object>> dropbox;

    public Optional<Output<Map<String,Object>>> dropbox() {
        return Optional.ofNullable(this.dropbox);
    }

    @Import(name="echosign")
    private @Nullable Output<Map<String,Object>> echosign;

    public Optional<Output<Map<String,Object>>> echosign() {
        return Optional.ofNullable(this.echosign);
    }

    @Import(name="egnyte")
    private @Nullable Output<Map<String,Object>> egnyte;

    public Optional<Output<Map<String,Object>>> egnyte() {
        return Optional.ofNullable(this.egnyte);
    }

    @Import(name="firebase")
    private @Nullable Output<Map<String,Object>> firebase;

    public Optional<Output<Map<String,Object>>> firebase() {
        return Optional.ofNullable(this.firebase);
    }

    @Import(name="layer")
    private @Nullable Output<Map<String,Object>> layer;

    public Optional<Output<Map<String,Object>>> layer() {
        return Optional.ofNullable(this.layer);
    }

    @Import(name="mscrm")
    private @Nullable Output<Map<String,Object>> mscrm;

    public Optional<Output<Map<String,Object>>> mscrm() {
        return Optional.ofNullable(this.mscrm);
    }

    @Import(name="newrelic")
    private @Nullable Output<Map<String,Object>> newrelic;

    public Optional<Output<Map<String,Object>>> newrelic() {
        return Optional.ofNullable(this.newrelic);
    }

    @Import(name="office365")
    private @Nullable Output<Map<String,Object>> office365;

    public Optional<Output<Map<String,Object>>> office365() {
        return Optional.ofNullable(this.office365);
    }

    @Import(name="rms")
    private @Nullable Output<Map<String,Object>> rms;

    public Optional<Output<Map<String,Object>>> rms() {
        return Optional.ofNullable(this.rms);
    }

    @Import(name="salesforce")
    private @Nullable Output<Map<String,Object>> salesforce;

    public Optional<Output<Map<String,Object>>> salesforce() {
        return Optional.ofNullable(this.salesforce);
    }

    @Import(name="salesforceApi")
    private @Nullable Output<Map<String,Object>> salesforceApi;

    public Optional<Output<Map<String,Object>>> salesforceApi() {
        return Optional.ofNullable(this.salesforceApi);
    }

    @Import(name="salesforceSandboxApi")
    private @Nullable Output<Map<String,Object>> salesforceSandboxApi;

    public Optional<Output<Map<String,Object>>> salesforceSandboxApi() {
        return Optional.ofNullable(this.salesforceSandboxApi);
    }

    /**
     * Configuration settings for a SAML add-on.
     * 
     */
    @Import(name="samlp")
    private @Nullable Output<GlobalClientAddonsSamlpArgs> samlp;

    /**
     * @return Configuration settings for a SAML add-on.
     * 
     */
    public Optional<Output<GlobalClientAddonsSamlpArgs>> samlp() {
        return Optional.ofNullable(this.samlp);
    }

    @Import(name="sapApi")
    private @Nullable Output<Map<String,Object>> sapApi;

    public Optional<Output<Map<String,Object>>> sapApi() {
        return Optional.ofNullable(this.sapApi);
    }

    @Import(name="sentry")
    private @Nullable Output<Map<String,Object>> sentry;

    public Optional<Output<Map<String,Object>>> sentry() {
        return Optional.ofNullable(this.sentry);
    }

    @Import(name="sharepoint")
    private @Nullable Output<Map<String,Object>> sharepoint;

    public Optional<Output<Map<String,Object>>> sharepoint() {
        return Optional.ofNullable(this.sharepoint);
    }

    @Import(name="slack")
    private @Nullable Output<Map<String,Object>> slack;

    public Optional<Output<Map<String,Object>>> slack() {
        return Optional.ofNullable(this.slack);
    }

    @Import(name="springcm")
    private @Nullable Output<Map<String,Object>> springcm;

    public Optional<Output<Map<String,Object>>> springcm() {
        return Optional.ofNullable(this.springcm);
    }

    @Import(name="wams")
    private @Nullable Output<Map<String,Object>> wams;

    public Optional<Output<Map<String,Object>>> wams() {
        return Optional.ofNullable(this.wams);
    }

    /**
     * WS-Fed (WIF) addon indicator. Actual configuration is stored in callback and `client_aliases` properties on the client.
     * 
     */
    @Import(name="wsfed")
    private @Nullable Output<Map<String,Object>> wsfed;

    /**
     * @return WS-Fed (WIF) addon indicator. Actual configuration is stored in callback and `client_aliases` properties on the client.
     * 
     */
    public Optional<Output<Map<String,Object>>> wsfed() {
        return Optional.ofNullable(this.wsfed);
    }

    @Import(name="zendesk")
    private @Nullable Output<Map<String,Object>> zendesk;

    public Optional<Output<Map<String,Object>>> zendesk() {
        return Optional.ofNullable(this.zendesk);
    }

    @Import(name="zoom")
    private @Nullable Output<Map<String,Object>> zoom;

    public Optional<Output<Map<String,Object>>> zoom() {
        return Optional.ofNullable(this.zoom);
    }

    private GlobalClientAddonsArgs() {}

    private GlobalClientAddonsArgs(GlobalClientAddonsArgs $) {
        this.aws = $.aws;
        this.azureBlob = $.azureBlob;
        this.azureSb = $.azureSb;
        this.box = $.box;
        this.cloudbees = $.cloudbees;
        this.concur = $.concur;
        this.dropbox = $.dropbox;
        this.echosign = $.echosign;
        this.egnyte = $.egnyte;
        this.firebase = $.firebase;
        this.layer = $.layer;
        this.mscrm = $.mscrm;
        this.newrelic = $.newrelic;
        this.office365 = $.office365;
        this.rms = $.rms;
        this.salesforce = $.salesforce;
        this.salesforceApi = $.salesforceApi;
        this.salesforceSandboxApi = $.salesforceSandboxApi;
        this.samlp = $.samlp;
        this.sapApi = $.sapApi;
        this.sentry = $.sentry;
        this.sharepoint = $.sharepoint;
        this.slack = $.slack;
        this.springcm = $.springcm;
        this.wams = $.wams;
        this.wsfed = $.wsfed;
        this.zendesk = $.zendesk;
        this.zoom = $.zoom;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GlobalClientAddonsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GlobalClientAddonsArgs $;

        public Builder() {
            $ = new GlobalClientAddonsArgs();
        }

        public Builder(GlobalClientAddonsArgs defaults) {
            $ = new GlobalClientAddonsArgs(Objects.requireNonNull(defaults));
        }

        public Builder aws(@Nullable Output<Map<String,Object>> aws) {
            $.aws = aws;
            return this;
        }

        public Builder aws(Map<String,Object> aws) {
            return aws(Output.of(aws));
        }

        public Builder azureBlob(@Nullable Output<Map<String,Object>> azureBlob) {
            $.azureBlob = azureBlob;
            return this;
        }

        public Builder azureBlob(Map<String,Object> azureBlob) {
            return azureBlob(Output.of(azureBlob));
        }

        public Builder azureSb(@Nullable Output<Map<String,Object>> azureSb) {
            $.azureSb = azureSb;
            return this;
        }

        public Builder azureSb(Map<String,Object> azureSb) {
            return azureSb(Output.of(azureSb));
        }

        public Builder box(@Nullable Output<Map<String,Object>> box) {
            $.box = box;
            return this;
        }

        public Builder box(Map<String,Object> box) {
            return box(Output.of(box));
        }

        public Builder cloudbees(@Nullable Output<Map<String,Object>> cloudbees) {
            $.cloudbees = cloudbees;
            return this;
        }

        public Builder cloudbees(Map<String,Object> cloudbees) {
            return cloudbees(Output.of(cloudbees));
        }

        public Builder concur(@Nullable Output<Map<String,Object>> concur) {
            $.concur = concur;
            return this;
        }

        public Builder concur(Map<String,Object> concur) {
            return concur(Output.of(concur));
        }

        public Builder dropbox(@Nullable Output<Map<String,Object>> dropbox) {
            $.dropbox = dropbox;
            return this;
        }

        public Builder dropbox(Map<String,Object> dropbox) {
            return dropbox(Output.of(dropbox));
        }

        public Builder echosign(@Nullable Output<Map<String,Object>> echosign) {
            $.echosign = echosign;
            return this;
        }

        public Builder echosign(Map<String,Object> echosign) {
            return echosign(Output.of(echosign));
        }

        public Builder egnyte(@Nullable Output<Map<String,Object>> egnyte) {
            $.egnyte = egnyte;
            return this;
        }

        public Builder egnyte(Map<String,Object> egnyte) {
            return egnyte(Output.of(egnyte));
        }

        public Builder firebase(@Nullable Output<Map<String,Object>> firebase) {
            $.firebase = firebase;
            return this;
        }

        public Builder firebase(Map<String,Object> firebase) {
            return firebase(Output.of(firebase));
        }

        public Builder layer(@Nullable Output<Map<String,Object>> layer) {
            $.layer = layer;
            return this;
        }

        public Builder layer(Map<String,Object> layer) {
            return layer(Output.of(layer));
        }

        public Builder mscrm(@Nullable Output<Map<String,Object>> mscrm) {
            $.mscrm = mscrm;
            return this;
        }

        public Builder mscrm(Map<String,Object> mscrm) {
            return mscrm(Output.of(mscrm));
        }

        public Builder newrelic(@Nullable Output<Map<String,Object>> newrelic) {
            $.newrelic = newrelic;
            return this;
        }

        public Builder newrelic(Map<String,Object> newrelic) {
            return newrelic(Output.of(newrelic));
        }

        public Builder office365(@Nullable Output<Map<String,Object>> office365) {
            $.office365 = office365;
            return this;
        }

        public Builder office365(Map<String,Object> office365) {
            return office365(Output.of(office365));
        }

        public Builder rms(@Nullable Output<Map<String,Object>> rms) {
            $.rms = rms;
            return this;
        }

        public Builder rms(Map<String,Object> rms) {
            return rms(Output.of(rms));
        }

        public Builder salesforce(@Nullable Output<Map<String,Object>> salesforce) {
            $.salesforce = salesforce;
            return this;
        }

        public Builder salesforce(Map<String,Object> salesforce) {
            return salesforce(Output.of(salesforce));
        }

        public Builder salesforceApi(@Nullable Output<Map<String,Object>> salesforceApi) {
            $.salesforceApi = salesforceApi;
            return this;
        }

        public Builder salesforceApi(Map<String,Object> salesforceApi) {
            return salesforceApi(Output.of(salesforceApi));
        }

        public Builder salesforceSandboxApi(@Nullable Output<Map<String,Object>> salesforceSandboxApi) {
            $.salesforceSandboxApi = salesforceSandboxApi;
            return this;
        }

        public Builder salesforceSandboxApi(Map<String,Object> salesforceSandboxApi) {
            return salesforceSandboxApi(Output.of(salesforceSandboxApi));
        }

        /**
         * @param samlp Configuration settings for a SAML add-on.
         * 
         * @return builder
         * 
         */
        public Builder samlp(@Nullable Output<GlobalClientAddonsSamlpArgs> samlp) {
            $.samlp = samlp;
            return this;
        }

        /**
         * @param samlp Configuration settings for a SAML add-on.
         * 
         * @return builder
         * 
         */
        public Builder samlp(GlobalClientAddonsSamlpArgs samlp) {
            return samlp(Output.of(samlp));
        }

        public Builder sapApi(@Nullable Output<Map<String,Object>> sapApi) {
            $.sapApi = sapApi;
            return this;
        }

        public Builder sapApi(Map<String,Object> sapApi) {
            return sapApi(Output.of(sapApi));
        }

        public Builder sentry(@Nullable Output<Map<String,Object>> sentry) {
            $.sentry = sentry;
            return this;
        }

        public Builder sentry(Map<String,Object> sentry) {
            return sentry(Output.of(sentry));
        }

        public Builder sharepoint(@Nullable Output<Map<String,Object>> sharepoint) {
            $.sharepoint = sharepoint;
            return this;
        }

        public Builder sharepoint(Map<String,Object> sharepoint) {
            return sharepoint(Output.of(sharepoint));
        }

        public Builder slack(@Nullable Output<Map<String,Object>> slack) {
            $.slack = slack;
            return this;
        }

        public Builder slack(Map<String,Object> slack) {
            return slack(Output.of(slack));
        }

        public Builder springcm(@Nullable Output<Map<String,Object>> springcm) {
            $.springcm = springcm;
            return this;
        }

        public Builder springcm(Map<String,Object> springcm) {
            return springcm(Output.of(springcm));
        }

        public Builder wams(@Nullable Output<Map<String,Object>> wams) {
            $.wams = wams;
            return this;
        }

        public Builder wams(Map<String,Object> wams) {
            return wams(Output.of(wams));
        }

        /**
         * @param wsfed WS-Fed (WIF) addon indicator. Actual configuration is stored in callback and `client_aliases` properties on the client.
         * 
         * @return builder
         * 
         */
        public Builder wsfed(@Nullable Output<Map<String,Object>> wsfed) {
            $.wsfed = wsfed;
            return this;
        }

        /**
         * @param wsfed WS-Fed (WIF) addon indicator. Actual configuration is stored in callback and `client_aliases` properties on the client.
         * 
         * @return builder
         * 
         */
        public Builder wsfed(Map<String,Object> wsfed) {
            return wsfed(Output.of(wsfed));
        }

        public Builder zendesk(@Nullable Output<Map<String,Object>> zendesk) {
            $.zendesk = zendesk;
            return this;
        }

        public Builder zendesk(Map<String,Object> zendesk) {
            return zendesk(Output.of(zendesk));
        }

        public Builder zoom(@Nullable Output<Map<String,Object>> zoom) {
            $.zoom = zoom;
            return this;
        }

        public Builder zoom(Map<String,Object> zoom) {
            return zoom(Output.of(zoom));
        }

        public GlobalClientAddonsArgs build() {
            return $;
        }
    }

}
