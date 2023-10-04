// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.outputs;

import com.pulumi.auth0.outputs.GetClientAddonSamlpLogout;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetClientAddonSamlp {
    private String audience;
    private String authnContextClassRef;
    private String binding;
    private Boolean createUpnClaim;
    private String destination;
    private String digestAlgorithm;
    private Boolean includeAttributeNameFormat;
    private String issuer;
    private Integer lifetimeInSeconds;
    private List<GetClientAddonSamlpLogout> logouts;
    private Boolean mapIdentities;
    private Boolean mapUnknownClaimsAsIs;
    private Map<String,Object> mappings;
    private String nameIdentifierFormat;
    private List<String> nameIdentifierProbes;
    private Boolean passthroughClaimsWithNoMapping;
    private String recipient;
    private Boolean signResponse;
    private String signatureAlgorithm;
    private String signingCert;
    private Boolean typedAttributes;

    private GetClientAddonSamlp() {}
    public String audience() {
        return this.audience;
    }
    public String authnContextClassRef() {
        return this.authnContextClassRef;
    }
    public String binding() {
        return this.binding;
    }
    public Boolean createUpnClaim() {
        return this.createUpnClaim;
    }
    public String destination() {
        return this.destination;
    }
    public String digestAlgorithm() {
        return this.digestAlgorithm;
    }
    public Boolean includeAttributeNameFormat() {
        return this.includeAttributeNameFormat;
    }
    public String issuer() {
        return this.issuer;
    }
    public Integer lifetimeInSeconds() {
        return this.lifetimeInSeconds;
    }
    public List<GetClientAddonSamlpLogout> logouts() {
        return this.logouts;
    }
    public Boolean mapIdentities() {
        return this.mapIdentities;
    }
    public Boolean mapUnknownClaimsAsIs() {
        return this.mapUnknownClaimsAsIs;
    }
    public Map<String,Object> mappings() {
        return this.mappings;
    }
    public String nameIdentifierFormat() {
        return this.nameIdentifierFormat;
    }
    public List<String> nameIdentifierProbes() {
        return this.nameIdentifierProbes;
    }
    public Boolean passthroughClaimsWithNoMapping() {
        return this.passthroughClaimsWithNoMapping;
    }
    public String recipient() {
        return this.recipient;
    }
    public Boolean signResponse() {
        return this.signResponse;
    }
    public String signatureAlgorithm() {
        return this.signatureAlgorithm;
    }
    public String signingCert() {
        return this.signingCert;
    }
    public Boolean typedAttributes() {
        return this.typedAttributes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClientAddonSamlp defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String audience;
        private String authnContextClassRef;
        private String binding;
        private Boolean createUpnClaim;
        private String destination;
        private String digestAlgorithm;
        private Boolean includeAttributeNameFormat;
        private String issuer;
        private Integer lifetimeInSeconds;
        private List<GetClientAddonSamlpLogout> logouts;
        private Boolean mapIdentities;
        private Boolean mapUnknownClaimsAsIs;
        private Map<String,Object> mappings;
        private String nameIdentifierFormat;
        private List<String> nameIdentifierProbes;
        private Boolean passthroughClaimsWithNoMapping;
        private String recipient;
        private Boolean signResponse;
        private String signatureAlgorithm;
        private String signingCert;
        private Boolean typedAttributes;
        public Builder() {}
        public Builder(GetClientAddonSamlp defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.audience = defaults.audience;
    	      this.authnContextClassRef = defaults.authnContextClassRef;
    	      this.binding = defaults.binding;
    	      this.createUpnClaim = defaults.createUpnClaim;
    	      this.destination = defaults.destination;
    	      this.digestAlgorithm = defaults.digestAlgorithm;
    	      this.includeAttributeNameFormat = defaults.includeAttributeNameFormat;
    	      this.issuer = defaults.issuer;
    	      this.lifetimeInSeconds = defaults.lifetimeInSeconds;
    	      this.logouts = defaults.logouts;
    	      this.mapIdentities = defaults.mapIdentities;
    	      this.mapUnknownClaimsAsIs = defaults.mapUnknownClaimsAsIs;
    	      this.mappings = defaults.mappings;
    	      this.nameIdentifierFormat = defaults.nameIdentifierFormat;
    	      this.nameIdentifierProbes = defaults.nameIdentifierProbes;
    	      this.passthroughClaimsWithNoMapping = defaults.passthroughClaimsWithNoMapping;
    	      this.recipient = defaults.recipient;
    	      this.signResponse = defaults.signResponse;
    	      this.signatureAlgorithm = defaults.signatureAlgorithm;
    	      this.signingCert = defaults.signingCert;
    	      this.typedAttributes = defaults.typedAttributes;
        }

        @CustomType.Setter
        public Builder audience(String audience) {
            this.audience = Objects.requireNonNull(audience);
            return this;
        }
        @CustomType.Setter
        public Builder authnContextClassRef(String authnContextClassRef) {
            this.authnContextClassRef = Objects.requireNonNull(authnContextClassRef);
            return this;
        }
        @CustomType.Setter
        public Builder binding(String binding) {
            this.binding = Objects.requireNonNull(binding);
            return this;
        }
        @CustomType.Setter
        public Builder createUpnClaim(Boolean createUpnClaim) {
            this.createUpnClaim = Objects.requireNonNull(createUpnClaim);
            return this;
        }
        @CustomType.Setter
        public Builder destination(String destination) {
            this.destination = Objects.requireNonNull(destination);
            return this;
        }
        @CustomType.Setter
        public Builder digestAlgorithm(String digestAlgorithm) {
            this.digestAlgorithm = Objects.requireNonNull(digestAlgorithm);
            return this;
        }
        @CustomType.Setter
        public Builder includeAttributeNameFormat(Boolean includeAttributeNameFormat) {
            this.includeAttributeNameFormat = Objects.requireNonNull(includeAttributeNameFormat);
            return this;
        }
        @CustomType.Setter
        public Builder issuer(String issuer) {
            this.issuer = Objects.requireNonNull(issuer);
            return this;
        }
        @CustomType.Setter
        public Builder lifetimeInSeconds(Integer lifetimeInSeconds) {
            this.lifetimeInSeconds = Objects.requireNonNull(lifetimeInSeconds);
            return this;
        }
        @CustomType.Setter
        public Builder logouts(List<GetClientAddonSamlpLogout> logouts) {
            this.logouts = Objects.requireNonNull(logouts);
            return this;
        }
        public Builder logouts(GetClientAddonSamlpLogout... logouts) {
            return logouts(List.of(logouts));
        }
        @CustomType.Setter
        public Builder mapIdentities(Boolean mapIdentities) {
            this.mapIdentities = Objects.requireNonNull(mapIdentities);
            return this;
        }
        @CustomType.Setter
        public Builder mapUnknownClaimsAsIs(Boolean mapUnknownClaimsAsIs) {
            this.mapUnknownClaimsAsIs = Objects.requireNonNull(mapUnknownClaimsAsIs);
            return this;
        }
        @CustomType.Setter
        public Builder mappings(Map<String,Object> mappings) {
            this.mappings = Objects.requireNonNull(mappings);
            return this;
        }
        @CustomType.Setter
        public Builder nameIdentifierFormat(String nameIdentifierFormat) {
            this.nameIdentifierFormat = Objects.requireNonNull(nameIdentifierFormat);
            return this;
        }
        @CustomType.Setter
        public Builder nameIdentifierProbes(List<String> nameIdentifierProbes) {
            this.nameIdentifierProbes = Objects.requireNonNull(nameIdentifierProbes);
            return this;
        }
        public Builder nameIdentifierProbes(String... nameIdentifierProbes) {
            return nameIdentifierProbes(List.of(nameIdentifierProbes));
        }
        @CustomType.Setter
        public Builder passthroughClaimsWithNoMapping(Boolean passthroughClaimsWithNoMapping) {
            this.passthroughClaimsWithNoMapping = Objects.requireNonNull(passthroughClaimsWithNoMapping);
            return this;
        }
        @CustomType.Setter
        public Builder recipient(String recipient) {
            this.recipient = Objects.requireNonNull(recipient);
            return this;
        }
        @CustomType.Setter
        public Builder signResponse(Boolean signResponse) {
            this.signResponse = Objects.requireNonNull(signResponse);
            return this;
        }
        @CustomType.Setter
        public Builder signatureAlgorithm(String signatureAlgorithm) {
            this.signatureAlgorithm = Objects.requireNonNull(signatureAlgorithm);
            return this;
        }
        @CustomType.Setter
        public Builder signingCert(String signingCert) {
            this.signingCert = Objects.requireNonNull(signingCert);
            return this;
        }
        @CustomType.Setter
        public Builder typedAttributes(Boolean typedAttributes) {
            this.typedAttributes = Objects.requireNonNull(typedAttributes);
            return this;
        }
        public GetClientAddonSamlp build() {
            final var o = new GetClientAddonSamlp();
            o.audience = audience;
            o.authnContextClassRef = authnContextClassRef;
            o.binding = binding;
            o.createUpnClaim = createUpnClaim;
            o.destination = destination;
            o.digestAlgorithm = digestAlgorithm;
            o.includeAttributeNameFormat = includeAttributeNameFormat;
            o.issuer = issuer;
            o.lifetimeInSeconds = lifetimeInSeconds;
            o.logouts = logouts;
            o.mapIdentities = mapIdentities;
            o.mapUnknownClaimsAsIs = mapUnknownClaimsAsIs;
            o.mappings = mappings;
            o.nameIdentifierFormat = nameIdentifierFormat;
            o.nameIdentifierProbes = nameIdentifierProbes;
            o.passthroughClaimsWithNoMapping = passthroughClaimsWithNoMapping;
            o.recipient = recipient;
            o.signResponse = signResponse;
            o.signatureAlgorithm = signatureAlgorithm;
            o.signingCert = signingCert;
            o.typedAttributes = typedAttributes;
            return o;
        }
    }
}
