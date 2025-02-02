// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0;

import com.pulumi.auth0.BrandingArgs;
import com.pulumi.auth0.Utilities;
import com.pulumi.auth0.inputs.BrandingState;
import com.pulumi.auth0.outputs.BrandingColors;
import com.pulumi.auth0.outputs.BrandingFont;
import com.pulumi.auth0.outputs.BrandingUniversalLogin;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * This resource allows you to manage branding within your Auth0 tenant. Auth0 can be customized with a look and feel that aligns with your organization&#39;s brand requirements and user expectations.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.auth0.Branding;
 * import com.pulumi.auth0.BrandingArgs;
 * import com.pulumi.auth0.inputs.BrandingColorsArgs;
 * import com.pulumi.auth0.inputs.BrandingUniversalLoginArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var myBrand = new Branding(&#34;myBrand&#34;, BrandingArgs.builder()        
 *             .logoUrl(&#34;https://mycompany.org/logo.png&#34;)
 *             .colors(BrandingColorsArgs.builder()
 *                 .primary(&#34;#0059d6&#34;)
 *                 .pageBackground(&#34;#000000&#34;)
 *                 .build())
 *             .universalLogin(BrandingUniversalLoginArgs.builder()
 *                 .body(Files.readString(Paths.get(&#34;universal_login_body.html&#34;)))
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * As this is not a resource identifiable by an ID within the Auth0 Management API,
 * 
 *  branding can be imported using a random string.
 * 
 * # 
 * 
 *  We recommend [Version 4 UUID](https://www.uuidgenerator.net/version4)
 * 
 * # 
 * 
 *  Example:
 * 
 * ```sh
 * $ pulumi import auth0:index/branding:Branding my_brand &#34;22f4f21b-017a-319d-92e7-2291c1ca36c4&#34;
 * ```
 * 
 */
@ResourceType(type="auth0:index/branding:Branding")
public class Branding extends com.pulumi.resources.CustomResource {
    /**
     * Configuration settings for colors for branding.
     * 
     */
    @Export(name="colors", refs={BrandingColors.class}, tree="[0]")
    private Output<BrandingColors> colors;

    /**
     * @return Configuration settings for colors for branding.
     * 
     */
    public Output<BrandingColors> colors() {
        return this.colors;
    }
    /**
     * URL for the favicon.
     * 
     */
    @Export(name="faviconUrl", refs={String.class}, tree="[0]")
    private Output<String> faviconUrl;

    /**
     * @return URL for the favicon.
     * 
     */
    public Output<String> faviconUrl() {
        return this.faviconUrl;
    }
    /**
     * Configuration settings to customize the font.
     * 
     */
    @Export(name="font", refs={BrandingFont.class}, tree="[0]")
    private Output<BrandingFont> font;

    /**
     * @return Configuration settings to customize the font.
     * 
     */
    public Output<BrandingFont> font() {
        return this.font;
    }
    /**
     * URL of logo for branding.
     * 
     */
    @Export(name="logoUrl", refs={String.class}, tree="[0]")
    private Output<String> logoUrl;

    /**
     * @return URL of logo for branding.
     * 
     */
    public Output<String> logoUrl() {
        return this.logoUrl;
    }
    /**
     * Configuration settings for Universal Login.
     * 
     */
    @Export(name="universalLogin", refs={BrandingUniversalLogin.class}, tree="[0]")
    private Output</* @Nullable */ BrandingUniversalLogin> universalLogin;

    /**
     * @return Configuration settings for Universal Login.
     * 
     */
    public Output<Optional<BrandingUniversalLogin>> universalLogin() {
        return Codegen.optional(this.universalLogin);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Branding(String name) {
        this(name, BrandingArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Branding(String name, @Nullable BrandingArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Branding(String name, @Nullable BrandingArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("auth0:index/branding:Branding", name, args == null ? BrandingArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Branding(String name, Output<String> id, @Nullable BrandingState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("auth0:index/branding:Branding", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Branding get(String name, Output<String> id, @Nullable BrandingState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Branding(name, id, state, options);
    }
}
