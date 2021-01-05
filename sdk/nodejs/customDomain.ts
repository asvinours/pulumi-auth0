// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
import * as utilities from "./utilities";

/**
 * With Auth0, you can use a custom domain to maintain a consistent user experience. This resource allows you to create and manage a custom domain within your Auth0 tenant.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as auth0 from "@pulumi/auth0";
 *
 * const myCustomDomain = new auth0.CustomDomain("my_custom_domain", {
 *     domain: "auth.example.com",
 *     type: "auth0_managed_certs",
 *     verificationMethod: "txt",
 * });
 * ```
 */
export class CustomDomain extends pulumi.CustomResource {
    /**
     * Get an existing CustomDomain resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: CustomDomainState, opts?: pulumi.CustomResourceOptions): CustomDomain {
        return new CustomDomain(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'auth0:index/customDomain:CustomDomain';

    /**
     * Returns true if the given object is an instance of CustomDomain.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is CustomDomain {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === CustomDomain.__pulumiType;
    }

    /**
     * String. Name of the custom domain.
     */
    public readonly domain!: pulumi.Output<string>;
    /**
     * Boolean. Indicates whether or not this is a primary domain.
     */
    public /*out*/ readonly primary!: pulumi.Output<boolean>;
    /**
     * String. Configuration status for the custom domain. Options include `disabled`, `pending`, `pendingVerification`, and `ready`.
     */
    public /*out*/ readonly status!: pulumi.Output<string>;
    /**
     * String. Provisioning type for the custom domain. Options include `auth0ManagedCerts` and `selfManagedCerts`.
     */
    public readonly type!: pulumi.Output<string>;
    /**
     * List(Resource). Configuration settings for verification. For details, see Verification.
     */
    public /*out*/ readonly verification!: pulumi.Output<outputs.CustomDomainVerification>;
    /**
     * String. Domain verification method. Options include `txt`.
     */
    public readonly verificationMethod!: pulumi.Output<string>;

    /**
     * Create a CustomDomain resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: CustomDomainArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: CustomDomainArgs | CustomDomainState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as CustomDomainState | undefined;
            inputs["domain"] = state ? state.domain : undefined;
            inputs["primary"] = state ? state.primary : undefined;
            inputs["status"] = state ? state.status : undefined;
            inputs["type"] = state ? state.type : undefined;
            inputs["verification"] = state ? state.verification : undefined;
            inputs["verificationMethod"] = state ? state.verificationMethod : undefined;
        } else {
            const args = argsOrState as CustomDomainArgs | undefined;
            if (!args || args.domain === undefined) {
                throw new Error("Missing required property 'domain'");
            }
            if (!args || args.type === undefined) {
                throw new Error("Missing required property 'type'");
            }
            if (!args || args.verificationMethod === undefined) {
                throw new Error("Missing required property 'verificationMethod'");
            }
            inputs["domain"] = args ? args.domain : undefined;
            inputs["type"] = args ? args.type : undefined;
            inputs["verificationMethod"] = args ? args.verificationMethod : undefined;
            inputs["primary"] = undefined /*out*/;
            inputs["status"] = undefined /*out*/;
            inputs["verification"] = undefined /*out*/;
        }
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        super(CustomDomain.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering CustomDomain resources.
 */
export interface CustomDomainState {
    /**
     * String. Name of the custom domain.
     */
    readonly domain?: pulumi.Input<string>;
    /**
     * Boolean. Indicates whether or not this is a primary domain.
     */
    readonly primary?: pulumi.Input<boolean>;
    /**
     * String. Configuration status for the custom domain. Options include `disabled`, `pending`, `pendingVerification`, and `ready`.
     */
    readonly status?: pulumi.Input<string>;
    /**
     * String. Provisioning type for the custom domain. Options include `auth0ManagedCerts` and `selfManagedCerts`.
     */
    readonly type?: pulumi.Input<string>;
    /**
     * List(Resource). Configuration settings for verification. For details, see Verification.
     */
    readonly verification?: pulumi.Input<inputs.CustomDomainVerification>;
    /**
     * String. Domain verification method. Options include `txt`.
     */
    readonly verificationMethod?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a CustomDomain resource.
 */
export interface CustomDomainArgs {
    /**
     * String. Name of the custom domain.
     */
    readonly domain: pulumi.Input<string>;
    /**
     * String. Provisioning type for the custom domain. Options include `auth0ManagedCerts` and `selfManagedCerts`.
     */
    readonly type: pulumi.Input<string>;
    /**
     * String. Domain verification method. Options include `txt`.
     */
    readonly verificationMethod: pulumi.Input<string>;
}
