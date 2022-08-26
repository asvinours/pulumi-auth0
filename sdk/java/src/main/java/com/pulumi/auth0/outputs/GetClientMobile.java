// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.outputs;

import com.pulumi.auth0.outputs.GetClientMobileAndroid;
import com.pulumi.auth0.outputs.GetClientMobileIo;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetClientMobile {
    private List<GetClientMobileAndroid> androids;
    private List<GetClientMobileIo> ios;

    private GetClientMobile() {}
    public List<GetClientMobileAndroid> androids() {
        return this.androids;
    }
    public List<GetClientMobileIo> ios() {
        return this.ios;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClientMobile defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetClientMobileAndroid> androids;
        private List<GetClientMobileIo> ios;
        public Builder() {}
        public Builder(GetClientMobile defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.androids = defaults.androids;
    	      this.ios = defaults.ios;
        }

        @CustomType.Setter
        public Builder androids(List<GetClientMobileAndroid> androids) {
            this.androids = Objects.requireNonNull(androids);
            return this;
        }
        public Builder androids(GetClientMobileAndroid... androids) {
            return androids(List.of(androids));
        }
        @CustomType.Setter
        public Builder ios(List<GetClientMobileIo> ios) {
            this.ios = Objects.requireNonNull(ios);
            return this;
        }
        public Builder ios(GetClientMobileIo... ios) {
            return ios(List.of(ios));
        }
        public GetClientMobile build() {
            final var o = new GetClientMobile();
            o.androids = androids;
            o.ios = ios;
            return o;
        }
    }
}
