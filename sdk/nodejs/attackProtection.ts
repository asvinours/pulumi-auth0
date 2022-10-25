// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
import * as utilities from "./utilities";

/**
 * Auth0 can detect attacks and stop malicious attempts to access your application such as blocking traffic from certain IPs and displaying CAPTCHAs.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as auth0 from "@pulumi/auth0";
 *
 * const myProtection = new auth0.AttackProtection("my_protection", {
 *     breachedPasswordDetection: {
 *         adminNotificationFrequencies: ["daily"],
 *         enabled: true,
 *         method: "standard",
 *         shields: [
 *             "admin_notification",
 *             "block",
 *         ],
 *     },
 *     bruteForceProtection: {
 *         allowlists: ["127.0.0.1"],
 *         enabled: true,
 *         maxAttempts: 5,
 *         mode: "count_per_identifier_and_ip",
 *         shields: [
 *             "block",
 *             "user_notification",
 *         ],
 *     },
 *     suspiciousIpThrottling: {
 *         allowlists: ["192.168.1.1"],
 *         enabled: true,
 *         preLogin: {
 *             maxAttempts: 100,
 *             rate: 864000,
 *         },
 *         preUserRegistration: {
 *             maxAttempts: 50,
 *             rate: 1200,
 *         },
 *         shields: [
 *             "admin_notification",
 *             "block",
 *         ],
 *     },
 * });
 * ```
 *
 * ## Import
 *
 * # As this is not a resource identifiable by an ID within the Auth0 Management API, # attack_protection can be imported using a random string. # # We recommend [Version 4 UUID](https://www.uuidgenerator.net/version4) # # Example
 *
 * ```sh
 *  $ pulumi import auth0:index/attackProtection:AttackProtection my_protection 24940d4b-4bd4-44e7-894e-f92e4de36a40
 * ```
 */
export class AttackProtection extends pulumi.CustomResource {
    /**
     * Get an existing AttackProtection resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AttackProtectionState, opts?: pulumi.CustomResourceOptions): AttackProtection {
        return new AttackProtection(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'auth0:index/attackProtection:AttackProtection';

    /**
     * Returns true if the given object is an instance of AttackProtection.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is AttackProtection {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === AttackProtection.__pulumiType;
    }

    /**
     * Breached password detection protects your applications from bad actors logging in with stolen credentials.
     */
    public readonly breachedPasswordDetection!: pulumi.Output<outputs.AttackProtectionBreachedPasswordDetection>;
    /**
     * Brute-force protection safeguards against a single IP address attacking a single user account.
     */
    public readonly bruteForceProtection!: pulumi.Output<outputs.AttackProtectionBruteForceProtection>;
    /**
     * Suspicious IP throttling blocks traffic from any IP address that rapidly attempts too many logins or signups.
     */
    public readonly suspiciousIpThrottling!: pulumi.Output<outputs.AttackProtectionSuspiciousIpThrottling>;

    /**
     * Create a AttackProtection resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: AttackProtectionArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AttackProtectionArgs | AttackProtectionState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as AttackProtectionState | undefined;
            resourceInputs["breachedPasswordDetection"] = state ? state.breachedPasswordDetection : undefined;
            resourceInputs["bruteForceProtection"] = state ? state.bruteForceProtection : undefined;
            resourceInputs["suspiciousIpThrottling"] = state ? state.suspiciousIpThrottling : undefined;
        } else {
            const args = argsOrState as AttackProtectionArgs | undefined;
            resourceInputs["breachedPasswordDetection"] = args ? args.breachedPasswordDetection : undefined;
            resourceInputs["bruteForceProtection"] = args ? args.bruteForceProtection : undefined;
            resourceInputs["suspiciousIpThrottling"] = args ? args.suspiciousIpThrottling : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(AttackProtection.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering AttackProtection resources.
 */
export interface AttackProtectionState {
    /**
     * Breached password detection protects your applications from bad actors logging in with stolen credentials.
     */
    breachedPasswordDetection?: pulumi.Input<inputs.AttackProtectionBreachedPasswordDetection>;
    /**
     * Brute-force protection safeguards against a single IP address attacking a single user account.
     */
    bruteForceProtection?: pulumi.Input<inputs.AttackProtectionBruteForceProtection>;
    /**
     * Suspicious IP throttling blocks traffic from any IP address that rapidly attempts too many logins or signups.
     */
    suspiciousIpThrottling?: pulumi.Input<inputs.AttackProtectionSuspiciousIpThrottling>;
}

/**
 * The set of arguments for constructing a AttackProtection resource.
 */
export interface AttackProtectionArgs {
    /**
     * Breached password detection protects your applications from bad actors logging in with stolen credentials.
     */
    breachedPasswordDetection?: pulumi.Input<inputs.AttackProtectionBreachedPasswordDetection>;
    /**
     * Brute-force protection safeguards against a single IP address attacking a single user account.
     */
    bruteForceProtection?: pulumi.Input<inputs.AttackProtectionBruteForceProtection>;
    /**
     * Suspicious IP throttling blocks traffic from any IP address that rapidly attempts too many logins or signups.
     */
    suspiciousIpThrottling?: pulumi.Input<inputs.AttackProtectionSuspiciousIpThrottling>;
}
