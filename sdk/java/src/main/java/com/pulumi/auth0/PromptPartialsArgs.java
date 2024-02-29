// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PromptPartialsArgs extends com.pulumi.resources.ResourceArgs {

    public static final PromptPartialsArgs Empty = new PromptPartialsArgs();

    /**
     * Content that goes at the end of the form.
     * 
     */
    @Import(name="formContentEnd")
    private @Nullable Output<String> formContentEnd;

    /**
     * @return Content that goes at the end of the form.
     * 
     */
    public Optional<Output<String>> formContentEnd() {
        return Optional.ofNullable(this.formContentEnd);
    }

    /**
     * Content that goes at the start of the form.
     * 
     */
    @Import(name="formContentStart")
    private @Nullable Output<String> formContentStart;

    /**
     * @return Content that goes at the start of the form.
     * 
     */
    public Optional<Output<String>> formContentStart() {
        return Optional.ofNullable(this.formContentStart);
    }

    /**
     * Footer content for the end of the footer.
     * 
     */
    @Import(name="formFooterEnd")
    private @Nullable Output<String> formFooterEnd;

    /**
     * @return Footer content for the end of the footer.
     * 
     */
    public Optional<Output<String>> formFooterEnd() {
        return Optional.ofNullable(this.formFooterEnd);
    }

    /**
     * Footer content for the start of the footer.
     * 
     */
    @Import(name="formFooterStart")
    private @Nullable Output<String> formFooterStart;

    /**
     * @return Footer content for the start of the footer.
     * 
     */
    public Optional<Output<String>> formFooterStart() {
        return Optional.ofNullable(this.formFooterStart);
    }

    /**
     * The prompt that you are adding partials for. Options are: `login-id`, `login`, `login-password`, `signup`, `signup-id`, `signup-password`.
     * 
     */
    @Import(name="prompt", required=true)
    private Output<String> prompt;

    /**
     * @return The prompt that you are adding partials for. Options are: `login-id`, `login`, `login-password`, `signup`, `signup-id`, `signup-password`.
     * 
     */
    public Output<String> prompt() {
        return this.prompt;
    }

    /**
     * Actions that go at the end of secondary actions.
     * 
     */
    @Import(name="secondaryActionsEnd")
    private @Nullable Output<String> secondaryActionsEnd;

    /**
     * @return Actions that go at the end of secondary actions.
     * 
     */
    public Optional<Output<String>> secondaryActionsEnd() {
        return Optional.ofNullable(this.secondaryActionsEnd);
    }

    /**
     * Actions that go at the start of secondary actions.
     * 
     */
    @Import(name="secondaryActionsStart")
    private @Nullable Output<String> secondaryActionsStart;

    /**
     * @return Actions that go at the start of secondary actions.
     * 
     */
    public Optional<Output<String>> secondaryActionsStart() {
        return Optional.ofNullable(this.secondaryActionsStart);
    }

    private PromptPartialsArgs() {}

    private PromptPartialsArgs(PromptPartialsArgs $) {
        this.formContentEnd = $.formContentEnd;
        this.formContentStart = $.formContentStart;
        this.formFooterEnd = $.formFooterEnd;
        this.formFooterStart = $.formFooterStart;
        this.prompt = $.prompt;
        this.secondaryActionsEnd = $.secondaryActionsEnd;
        this.secondaryActionsStart = $.secondaryActionsStart;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PromptPartialsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PromptPartialsArgs $;

        public Builder() {
            $ = new PromptPartialsArgs();
        }

        public Builder(PromptPartialsArgs defaults) {
            $ = new PromptPartialsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param formContentEnd Content that goes at the end of the form.
         * 
         * @return builder
         * 
         */
        public Builder formContentEnd(@Nullable Output<String> formContentEnd) {
            $.formContentEnd = formContentEnd;
            return this;
        }

        /**
         * @param formContentEnd Content that goes at the end of the form.
         * 
         * @return builder
         * 
         */
        public Builder formContentEnd(String formContentEnd) {
            return formContentEnd(Output.of(formContentEnd));
        }

        /**
         * @param formContentStart Content that goes at the start of the form.
         * 
         * @return builder
         * 
         */
        public Builder formContentStart(@Nullable Output<String> formContentStart) {
            $.formContentStart = formContentStart;
            return this;
        }

        /**
         * @param formContentStart Content that goes at the start of the form.
         * 
         * @return builder
         * 
         */
        public Builder formContentStart(String formContentStart) {
            return formContentStart(Output.of(formContentStart));
        }

        /**
         * @param formFooterEnd Footer content for the end of the footer.
         * 
         * @return builder
         * 
         */
        public Builder formFooterEnd(@Nullable Output<String> formFooterEnd) {
            $.formFooterEnd = formFooterEnd;
            return this;
        }

        /**
         * @param formFooterEnd Footer content for the end of the footer.
         * 
         * @return builder
         * 
         */
        public Builder formFooterEnd(String formFooterEnd) {
            return formFooterEnd(Output.of(formFooterEnd));
        }

        /**
         * @param formFooterStart Footer content for the start of the footer.
         * 
         * @return builder
         * 
         */
        public Builder formFooterStart(@Nullable Output<String> formFooterStart) {
            $.formFooterStart = formFooterStart;
            return this;
        }

        /**
         * @param formFooterStart Footer content for the start of the footer.
         * 
         * @return builder
         * 
         */
        public Builder formFooterStart(String formFooterStart) {
            return formFooterStart(Output.of(formFooterStart));
        }

        /**
         * @param prompt The prompt that you are adding partials for. Options are: `login-id`, `login`, `login-password`, `signup`, `signup-id`, `signup-password`.
         * 
         * @return builder
         * 
         */
        public Builder prompt(Output<String> prompt) {
            $.prompt = prompt;
            return this;
        }

        /**
         * @param prompt The prompt that you are adding partials for. Options are: `login-id`, `login`, `login-password`, `signup`, `signup-id`, `signup-password`.
         * 
         * @return builder
         * 
         */
        public Builder prompt(String prompt) {
            return prompt(Output.of(prompt));
        }

        /**
         * @param secondaryActionsEnd Actions that go at the end of secondary actions.
         * 
         * @return builder
         * 
         */
        public Builder secondaryActionsEnd(@Nullable Output<String> secondaryActionsEnd) {
            $.secondaryActionsEnd = secondaryActionsEnd;
            return this;
        }

        /**
         * @param secondaryActionsEnd Actions that go at the end of secondary actions.
         * 
         * @return builder
         * 
         */
        public Builder secondaryActionsEnd(String secondaryActionsEnd) {
            return secondaryActionsEnd(Output.of(secondaryActionsEnd));
        }

        /**
         * @param secondaryActionsStart Actions that go at the start of secondary actions.
         * 
         * @return builder
         * 
         */
        public Builder secondaryActionsStart(@Nullable Output<String> secondaryActionsStart) {
            $.secondaryActionsStart = secondaryActionsStart;
            return this;
        }

        /**
         * @param secondaryActionsStart Actions that go at the start of secondary actions.
         * 
         * @return builder
         * 
         */
        public Builder secondaryActionsStart(String secondaryActionsStart) {
            return secondaryActionsStart(Output.of(secondaryActionsStart));
        }

        public PromptPartialsArgs build() {
            if ($.prompt == null) {
                throw new MissingRequiredPropertyException("PromptPartialsArgs", "prompt");
            }
            return $;
        }
    }

}
