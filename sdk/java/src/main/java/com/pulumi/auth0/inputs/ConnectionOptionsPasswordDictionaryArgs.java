// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConnectionOptionsPasswordDictionaryArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConnectionOptionsPasswordDictionaryArgs Empty = new ConnectionOptionsPasswordDictionaryArgs();

    @Import(name="dictionaries")
    private @Nullable Output<List<String>> dictionaries;

    public Optional<Output<List<String>>> dictionaries() {
        return Optional.ofNullable(this.dictionaries);
    }

    @Import(name="enable")
    private @Nullable Output<Boolean> enable;

    public Optional<Output<Boolean>> enable() {
        return Optional.ofNullable(this.enable);
    }

    private ConnectionOptionsPasswordDictionaryArgs() {}

    private ConnectionOptionsPasswordDictionaryArgs(ConnectionOptionsPasswordDictionaryArgs $) {
        this.dictionaries = $.dictionaries;
        this.enable = $.enable;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectionOptionsPasswordDictionaryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectionOptionsPasswordDictionaryArgs $;

        public Builder() {
            $ = new ConnectionOptionsPasswordDictionaryArgs();
        }

        public Builder(ConnectionOptionsPasswordDictionaryArgs defaults) {
            $ = new ConnectionOptionsPasswordDictionaryArgs(Objects.requireNonNull(defaults));
        }

        public Builder dictionaries(@Nullable Output<List<String>> dictionaries) {
            $.dictionaries = dictionaries;
            return this;
        }

        public Builder dictionaries(List<String> dictionaries) {
            return dictionaries(Output.of(dictionaries));
        }

        public Builder dictionaries(String... dictionaries) {
            return dictionaries(List.of(dictionaries));
        }

        public Builder enable(@Nullable Output<Boolean> enable) {
            $.enable = enable;
            return this;
        }

        public Builder enable(Boolean enable) {
            return enable(Output.of(enable));
        }

        public ConnectionOptionsPasswordDictionaryArgs build() {
            return $;
        }
    }

}
